package com.lin.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.lf5.util.Resource;
import org.junit.Test;

import com.lin.pojo.User;
import com.lin.utils.SqlSessionFactoryUtil;

/*
*@author linone
*/
public class Test01 {

	@Test
	public void testById() throws IOException {
		SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder(); // 利用ibatis 包下的resources把文件装换成流对象
		InputStream resourceAsStream = Resources.getResourceAsStream("SqlMapConfig.xml"); // 得到sqlsessionfactory
		SqlSessionFactory ssf = ssfb.build(resourceAsStream); // 等到sqlsession
		SqlSession ss = ssf.openSession(); // 执行查询,第一个参数是配置的sql id 第二个参数是入参 
		User user = ss.selectOne("user.getUserById", 1);
		System.out.println(user);
		ss.close();// 关流
	}

	@Test
	public void testByUsername() {
		SqlSessionFactory ssf = SqlSessionFactoryUtil.getSsf();
		SqlSession ss = ssf.openSession();
		List<User> list = ss.selectList("user.getUserByUsername", "张");
		for (User user : list) {
			System.out.println(user);
		}
	}

	@Test
	public void inserUser() {
		SqlSessionFactory ssf = SqlSessionFactoryUtil.getSsf();
		SqlSession ss = ssf.openSession();
		User user = new User();
		user.setUsername("林四一");
		user.setBirthday(new Date());
		user.setSex("1");
		user.setAddress("深圳");
		ss.insert("user.insertUser", user);
		 ss.commit();//提交事务
		 System.out.println(user);//测试能不能获取到主键 
		 ss.close(); 
	}

	@Test
	public void inserUUID() {
		SqlSessionFactory ssf = SqlSessionFactoryUtil.getSsf();
		SqlSession ss = ssf.openSession();
		User user = new User();
		user.setUsername("林一");
		user.setBirthday(new Date());
		user.setSex("1");
		user.setAddress("深圳");
		ss.insert("user.insertUuid", user);
		ss.commit(); 
		System.out.println(user);//测试能不能获取到uuid 
		ss.close();
	}

	@Test
	public void deleteUser() {
		SqlSessionFactory ssf = SqlSessionFactoryUtil.getSsf();
		SqlSession ss = ssf.openSession();
		ss.delete("user.deleteUser", 45);
		ss.commit();
	}// 对数据的操作一定要提交事务 ss.close(); }

	@Test
	public void updateUser() {
		SqlSessionFactory ssf = SqlSessionFactoryUtil.getSsf();
		SqlSession ss = ssf.openSession();
		User user = new User();
		user.setUsername("林三");
		user.setId(50);
		ss.update("user.updateUser", user);
		ss.commit();// 对数据的操作一定要提交事务
		ss.close();
	}

}
