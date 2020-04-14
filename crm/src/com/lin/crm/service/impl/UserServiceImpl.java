package com.lin.crm.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.lin.crm.domain.User;
import com.lin.crm.service.UserService;
import com.lin.crm.utils.MD5Utils;
import com.lin.dao.UserDao;
/**
 * 用户管理的Service的实现类
 * @author jt
 *
 */
@Transactional
public class UserServiceImpl implements UserService {

	// 注入DAO:
	private UserDao userDao;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void regist(User user) {
		user.setUser_password(MD5Utils.md5(user.getUser_password()));
		user.setUser_state("1");
		userDao.save(user);
	}

	@Override
	// 业务层用户登录的方法
	public User login(User user) {
		user.setUser_password(MD5Utils.md5(user.getUser_password()));
		// 调用DAO
		return userDao.login(user);
	}

	@Override
	public List<User> findAll() {
		return userDao.findAll();
	}

}
