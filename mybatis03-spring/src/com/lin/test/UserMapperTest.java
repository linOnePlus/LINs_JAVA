package com.lin.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lin.mapper.UserMapper;
import com.lin.pojo.User;

/*
*@author linone
*/
public class UserMapperTest {

private ApplicationContext ac;
	
	@Before   //在执行任何方法之前先执行该方法
	public void init() {
		ac=new ClassPathXmlApplicationContext("applicationContext.xml");
	}

	@Test
	public void test() {
		UserMapper mapper = ac.getBean(UserMapper.class);
		User userById = mapper.getUserById(1);
		System.out.println(userById);
	}
}
