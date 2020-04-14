package com.lin.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import com.lin.bean.User;

/*
*@author linone
*/
public interface UserDao {

	/**
	 * У���û���ȷ��
	 * 
	 * @param user ��װ�� USERNAME �� PASSWORD
	 * @return
	 * @throws SQLException
	 */
	boolean checkUser(User user) throws SQLException;

	/**
	 * ��ȡ��ѯ�����û�����Ϣ����
	 * 
	 * @param username
	 * @return �鵽������
	 * @throws SQLException
	 */
	int checkUsernameCount(String username) throws SQLException;
	
	/**
	 * ������û�
	 * @param username
	 * @param passsword
	 * @return Ӱ����������ɹ���ʧ��
	 * @throws SQLException
	 */
	int insertUser(String username, String password) throws SQLException;

}
