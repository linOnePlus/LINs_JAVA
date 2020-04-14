package com.lin.pojo;

import java.util.List;

/*
 * Userpojo的包装类
 * 以后就可以用来封装账号 和密码等
*@author linone
*/
public class UserBuffered {

private User user;
List<Integer> ids;

public List<Integer> getList() {
	return ids;
}

public void setList(List<Integer> ids) {
	this.ids = ids;
}

public User getUser() {
	return user;
}

public void setUser(User user) {
	this.user = user;
}

}
