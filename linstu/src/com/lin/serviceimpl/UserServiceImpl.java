package com.lin.serviceimpl;

import java.sql.SQLException;

import com.lin.bean.User;
import com.lin.dao.UserDao;
import com.lin.dao.impl.UserDaoImpl;
import com.lin.service.UserService;

/*
*@author linone
*/
public class UserServiceImpl  implements UserService{

	@Override
	public boolean checkUser(User user) throws SQLException {
		UserDao dao = new UserDaoImpl();
		return dao.checkUser(user);
	}

	@Override
	public int checkUsernameCount(String username) throws SQLException {
		UserDao dao = new UserDaoImpl();
		return dao.checkUsernameCount(username);
	}

	@Override
	public int insertUser(String username, String password) throws SQLException {
		UserDao  dao = new UserDaoImpl();
		return  dao.insertUser(username, password);
	}


}
