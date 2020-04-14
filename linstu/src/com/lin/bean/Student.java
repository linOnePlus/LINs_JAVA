package com.lin.bean;

import java.util.Date;

/*
 * 学生封装对象bean
*@author linone
*/
public class Student {
	private int sid;
	private String phone;
	private String sname;
	private String gender;
	private String hobby;
	private String info;
	private Date birthday;
	public int getSid() {
		return sid;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}

	public Student(String phone, String sname, String gender, String hobby, String info, Date birthday) {
		super();
		
		this.phone = phone;
		this.sname = sname;
		this.gender = gender;
		this.hobby = hobby;
		this.info = info;
		this.birthday = birthday;
	}
	public Student(int sid,String phone, String sname, String gender, String hobby, String info, Date birthday) {
		super();
		
		this.phone = phone;
		this.sname = sname;
		this.gender = gender;
		this.hobby = hobby;
		this.info = info;
		this.birthday = birthday;
		this.sid= sid;
	}
	public Student() {
		super();
		
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", phone=" + phone + ", sname=" + sname + ", gender=" + gender + ", hobby="
				+ hobby + ", info=" + info + ", date=" + birthday + "]";
	}
	
	
	
}
