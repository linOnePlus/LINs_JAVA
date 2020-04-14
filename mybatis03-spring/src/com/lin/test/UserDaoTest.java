package com.lin.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lin.dao.UserDao;
import com.lin.dao.impl.UserDaoImpl;
import com.lin.pojo.User;

/*
*@author linone
*传统dao开发模式测试类
*/
public class UserDaoTest {
	
	private ApplicationContext ac;
	
	@Before   //在执行任何方法之前先执行该方法
	public void init() {
		ac=new ClassPathXmlApplicationContext("applicationContext.xml");
	}

	@Test
	public void test() {
		UserDao dao =  ac.getBean(UserDaoImpl.class);//为什么这里是userdao.class
		User userById = dao.getUserById(1);
		System.out.println(userById);
	}

}
