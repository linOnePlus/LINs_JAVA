package com.lin.pojo;
/*
*@author linone
*/

import java.util.Date;

public class item {
private  int id ;	
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
private String  name; 
private int price;
private Date createtime;
private String detail;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public Date getCreatetime() {
	return createtime;
}

public item(int id, String name, int price, Date createtime, String detail) {
	super();
	this.id = id;
	this.name = name;
	this.price = price;
	this.createtime = createtime;
	this.detail = detail;
}
public void setCreatetime(Date createtime) {
	this.createtime = createtime;
}
public String getDetail() {
	return detail;
}
public void setDetail(String detail) {
	this.detail = detail;
}

}
