package com.lin.dao;

import java.util.List;

import com.lin.pojo.User;

/*
 * 用户信息持久化接口
*@author linone
*/
public interface UserDao{
	/**
	 * 根据用户id信息查询讯息
	 * @param id
	 * @return
	 */
	User getUserById(Integer id);
	
	/**
	 * 根据用户名查询信息(模糊查询)
	 * @param username
	 * @return
	 */
	List<User> getUserByUsername(String username);
	
	/**
	 * 插入用户信息
	 * @param user
	 */
	void insertUser(User user);
}
