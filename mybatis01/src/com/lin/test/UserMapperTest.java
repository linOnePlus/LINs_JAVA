package com.lin.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.lin.dao.UserDao;
import com.lin.pojo.User;
import com.lin.utils.SqlSessionFactoryUtil;

/*
*@author linone
*测试动态代理的dao开发方式
*/
public class UserMapperTest {

	@Test
	public void testGetUserById() {
		SqlSession session = SqlSessionFactoryUtil.getSsf().openSession();
		UserDao mapper = session.getMapper(UserDao.class);//底层帮我们创建dao实现类
		User user = mapper.getUserById(50);
		System.out.println(user);
		session.close();
	}

	@Test
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

	@Test
	public void testInsertUser() {
		SqlSession sqlSession = SqlSessionFactoryUtil.getSsf().openSession();
		UserDao mapper = sqlSession.getMapper(UserDao.class);
		User user = new User();
		user.setUsername("skj");
		mapper.insertUser(user);
		sqlSession.commit();
		sqlSession.close();
	}

}
