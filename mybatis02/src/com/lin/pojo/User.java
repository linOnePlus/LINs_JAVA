package com.lin.pojo;

import java.util.Date;
import java.util.List;

/**
 * 跟数据库列名相映射的bean
 * @author Administrator
 *
 */
public class User {

	private Integer id;
	private String username;// 用户姓名
	private String uuid2;
	private Date birthday;// 生日
	private String address;// 地址
	private String sex;// 性别
	private List<Order> orders;//测试一对多关联查询

	public String getUuid2() {
		return uuid2;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public void setUuid2(String uuid2) {
		this.uuid2 = uuid2;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", uuid2=" + uuid2 + ", birthday=" + birthday
				+ ", address=" + address + ", sex=" + sex + ", orders=" + orders + "]";
	}

	
	

}
