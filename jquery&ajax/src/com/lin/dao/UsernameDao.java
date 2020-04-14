package com.lin.dao;

import java.sql.SQLException;

/*
*@author linone
*/
public interface UsernameDao {
/**
 * 获取查询到的信息数量
 * @param username
 * @return 1 或者0 
 * @throws SQLException
 */
	int checkUsername(String username) throws SQLException;
}
