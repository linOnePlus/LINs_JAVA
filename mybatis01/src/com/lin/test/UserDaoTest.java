package com.lin.test;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import org.junit.Test;

import com.lin.dao.UserDao;
import com.lin.dao.impl.UserDaoimpl;
import com.lin.pojo.User;

/*
*@author linone
*传统dao包装测试
*/
public class UserDaoTest {

	@Test
	public void testGetUserById() {
		UserDao dao = new UserDaoimpl();
		User user = dao.getUserById(31);
		System.out.println(user);
	}

	@Test
	public void testGetUserByUsername() {
		UserDao dao = new UserDaoimpl();
		List<User> userByUsername = dao.getUserByUsername("林");
		for (User user : userByUsername) {
			System.out.println(user);
		}
	}

	@Test
	public void testInsertUser() {
		UserDao dao = new UserDaoimpl();
		User user = new User();
		user.setAddress("shenzhen");
		user.setBirthday(new Date(300l));
		user.setSex("1");
		user.setUsername("sp");
		dao.insertUser(user);
	}

}
