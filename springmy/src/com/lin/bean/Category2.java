package com.lin.bean;

import org.springframework.stereotype.Component;

/*
*@author linone
*/
@Component("c2")
public class Category2 {
private int id ;
 private String name ="iphone";
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
 
}
