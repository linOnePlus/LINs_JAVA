package cn.campus.Service;

import cn.campus.Bean.Userbean;

public interface UserService {
	//以用户名查询用户
	Userbean findByUser(String username);
}
