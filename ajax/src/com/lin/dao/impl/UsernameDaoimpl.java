package com.lin.dao.impl;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.lin.dao.UsernameDao;
import com.lin.util.JDBCUtil_c3p0;

/*
*@author linone
*/
public class UsernameDaoimpl implements UsernameDao {

	@Override
	public int checkUsername(String username) throws SQLException {
		QueryRunner queryRunner = new QueryRunner(JDBCUtil_c3p0.getDataSource());
	 Long a =(Long)queryRunner .query("select count(*) from user where username =?", new ScalarHandler(),username);
		 return a.intValue();
	}

}
