package com.lin.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.lin.dao.UserDao;
import com.lin.pojo.Order;
import com.lin.pojo.OrderUser;
import com.lin.pojo.User;
import com.lin.pojo.UserBuffered;
import com.lin.utils.SqlSessionFactoryUtil;

/*
*@author linone
*测试动态代理的dao开发方式
*/
public class UserMapperTest {

	
	public void testGetUserById() {
		SqlSession session = SqlSessionFactoryUtil.getSsf().openSession();
		UserDao mapper = session.getMapper(UserDao.class);//底层帮我们创建dao实现类
		User user = mapper.getUserById(50);
		System.out.println(user);
		session.close();
	}

	
	public void testGetUserByUsername() throws IOException {
		SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
		InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
		SqlSessionFactory ssf = ssfb.build(inputStream);
		SqlSession ss = ssf.openSession();
		UserDao mapper = ss.getMapper(UserDao.class);
		List<User> list = mapper.getUserByUsername("林");
		for (User user : list) {
			System.out.println(user);
		}
		ss.close();
	}

	
	public void testInsertUser() {
		SqlSession sqlSession = SqlSessionFactoryUtil.getSsf().openSession();
		UserDao mapper = sqlSession.getMapper(UserDao.class);
		User user = new User();
		user.setUsername("skj");
		mapper.insertUser(user);
		sqlSession.commit();
		sqlSession.close();
	}

	
	public void testUserBuffered() {
		SqlSession sqlSession = SqlSessionFactoryUtil.getSsf().openSession();
		UserDao mapper = sqlSession.getMapper(UserDao.class);
		UserBuffered userBuffered = new UserBuffered();
		User user = new User();
		user.setUsername("林");
		userBuffered.setUser(user);
		List<User> list = mapper.getUserByUserBuffered(userBuffered);
		for (User user2 : list) {
			System.out.println(user2);
		}
		sqlSession.close();
	}
	

	public void testif() {
		SqlSession sqlSession = SqlSessionFactoryUtil.getSsf().openSession();
		UserDao mapper = sqlSession.getMapper(UserDao.class);
		User user = new User();
		user.setUsername("林");
		user.setSex("1");
		List<User> list = mapper.getUserByif(user);
		for (User user2 : list) {
			System.out.println(user2);
		}
		sqlSession.close();
	}
	
	
	public void testforeach() {
		SqlSession sqlsession = SqlSessionFactoryUtil.getSsf().openSession();
		UserBuffered userbuffer = new UserBuffered();
		userbuffer.setList(Arrays.asList(1,10,16));
		UserDao dao = sqlsession.getMapper(UserDao.class);
		List<User> list = dao.getUserByForeach(userbuffer);
		for (User user : list) {
			System.out.println(user);
		}
		sqlsession.close();
	}
	
	@Test
	public void testUserOrder() throws IOException {
		SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
		InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
		SqlSessionFactory ssf = ssfb.build(inputStream);
		SqlSession ss = ssf.openSession();
		UserDao dao = ss.getMapper(UserDao.class);
		List<User> userOrder = dao.getUserOrder();
		for (User user : userOrder) {
			System.out.println(user);
			for (Order order : user.getOrders()) {
				System.out.println("此用户的订单是"+order);
			}
		}
	}
}
