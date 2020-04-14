package com.lin.bean;
/*
*@author linone
*/
public class Person {

	private String name; 
	private Car car;
	
	public void setCar(Car car) {
		this.car = car;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void  hello() {
		System.out.println(this.name);
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", car=" + car + "]";
	}
}
