package com.lin.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import com.lin.bean.User;

/*
*@author linone
*/
public interface UserDao {

	/**
	 * 校验用户正确性
	 * 
	 * @param user 封装了 USERNAME 和 PASSWORD
	 * @return
	 * @throws SQLException
	 */
	boolean checkUser(User user) throws SQLException;

	/**
	 * 获取查询到的用户名信息数量
	 * 
	 * @param username
	 * @return 查到的数量
	 * @throws SQLException
	 */
	int checkUsernameCount(String username) throws SQLException;
	
	/**
	 * 添加新用户
	 * @param username
	 * @param passsword
	 * @return 影响的行数汉成功或失败
	 * @throws SQLException
	 */
	int insertUser(String username, String password) throws SQLException;

}
