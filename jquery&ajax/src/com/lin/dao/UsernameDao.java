package com.lin.dao;

import java.sql.SQLException;

/*
*@author linone
*/
public interface UsernameDao {
/**
 * ��ȡ��ѯ������Ϣ����
 * @param username
 * @return 1 ����0 
 * @throws SQLException
 */
	int checkUsername(String username) throws SQLException;
}
