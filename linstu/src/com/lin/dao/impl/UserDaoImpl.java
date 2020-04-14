package com.lin.dao.impl;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.lin.bean.User;
import com.lin.dao.UserDao;
import com.lin.util.JDBCUtil_c3p0;

/*
*@author linone
*/
public class UserDaoImpl implements UserDao {

	@Override
	public boolean checkUser(User user) throws SQLException {
		QueryRunner queryRunner = new QueryRunner(JDBCUtil_c3p0.getDataSource());
		Long a  = (Long) queryRunner.query("select count(*) from  user where username=? and password =?", 
				new ScalarHandler(),user.getUsername(),user.getPassword());
		if (a>0) {
			return true;
		} else {
      return false;
		}
	}

	@Override
	public int checkUsernameCount(String username) throws SQLException {
		QueryRunner queryRunner = new QueryRunner(JDBCUtil_c3p0.getDataSource());
	 Long a =(Long)queryRunner.query("select count(*) from user where username =?", new ScalarHandler(),username);
		 return a.intValue();
	}

	@Override
	public  int  insertUser(String username, String password) throws SQLException {
		
		QueryRunner queryRunner = new  QueryRunner(JDBCUtil_c3p0.getDataSource());
		int update = queryRunner.update("insert into user values(?,?)", username,password);
		return update;
	}
}
