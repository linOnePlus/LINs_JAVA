package com.lin.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.lin.dao.UserDao;
import com.lin.pojo.User;

/*
*@author linone
*/
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

	@Override
	public User getUserById(Integer id) {
		SqlSession sqlSession =  super.getSqlSession(); //sqlsession交给spring了
		User user = sqlSession.selectOne("user.getUserById", id);
		return user;
	}

	@Override
	public List<User> getUserByUsername(String username) {
		SqlSession session = super.getSqlSession();
		List<User> list = session.selectList("user.getUserByUsername", username);
		return list;
	}

	@Override
	public void insertUser(User user) {
		SqlSession sqlSession2 = getSqlSession();
		sqlSession2.insert("user.insertUser", user);
		//事务管理也交给spring
	}

}
