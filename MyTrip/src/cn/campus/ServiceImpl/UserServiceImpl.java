package cn.campus.ServiceImpl;

import cn.campus.Bean.Userbean;
import cn.campus.Service.UserService;
import cn.campus.dao.impl.Userdaoimpl;


public class UserServiceImpl implements UserService {

	@Override
	public Userbean findByUser(String username) {
		return new Userdaoimpl().findByUser(username);
	}

}
