package com.lin.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*
*@author linone
*��ע��ķ�ʽ��Product����ע��һ��Category����
*/
@Component("p3")
public class Product3 {
	private int id;
	private String name = "dageda";
	@Autowired//@Resource(name="c")Ҳ����
	private Category2 category2;
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
	public Category2 getCategory2() {
		return category2;
	}
	public void setCategory2(Category2 category2) {
		this.category2 = category2;
	}

}
