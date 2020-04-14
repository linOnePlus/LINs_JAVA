package com.lin.dao;

import java.util.List;

import com.lin.pojo.User;
import com.lin.pojo.UserBuffered;

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
	
	/**
	 *测试插入一个包装POJO
	 * @param userBuffered
	 * @return
	 */
	List<User> getUserByUserBuffered(UserBuffered userBuffered);
	
	/**
	 * 测试动态if
	 * @param user
	 * @return
	 */
	List<User> getUserByif(User user);
	
	/**
	 * 测试动态foreach
	 * @param user
	 * @return
	 */
	List<User> getUserByForeach(UserBuffered buffered);
	
	/**
	 * 测试一对多查询
	 */
	List<User>  getUserOrder();
	
}
