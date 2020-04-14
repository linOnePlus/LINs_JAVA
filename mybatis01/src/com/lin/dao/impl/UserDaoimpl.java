package com.lin.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.lin.dao.UserDao;
import com.lin.pojo.User;
import com.lin.utils.SqlSessionFactoryUtil;

/*
 * 用户信息持久化实现
*@author linone
*/
public class UserDaoimpl implements UserDao {

	@Override
	public User getUserById(Integer id) {
		SqlSession ss = SqlSessionFactoryUtil.getSsf().openSession();
		User user = ss.selectOne("user.getUserById", id);
		ss.close();
		return user;
	}

	@Override
	public List<User> getUserByUsername(String username) {
		SqlSession ss = SqlSessionFactoryUtil.getSsf().openSession();
		List<User> list = ss.selectList("user.getUserByUsername", username);
		ss.close();
		return list;
	}

	@Override
	public void insertUser(User user) {
		SqlSession ss = SqlSessionFactoryUtil.getSsf().openSession();
		ss.insert("user.insertUser", user);
		ss.commit();
		ss.close();

	}

}
