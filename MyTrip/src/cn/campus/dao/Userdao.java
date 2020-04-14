package cn.campus.dao;

import java.util.List;

import cn.campus.Bean.Userbean;

public interface Userdao {
	boolean login(String usname, String pwd);
	int regist(Userbean user);
	Userbean findByUser(String usname);
}
