package com.lin.dao;

import com.lin.crm.domain.User;

/**
 * 用户管理的DAO的接口
 * @author jt
 *
 */
public interface UserDao extends BaseDao<User>{

	User login(User user);

}
