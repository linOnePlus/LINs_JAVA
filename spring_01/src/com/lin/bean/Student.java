package com.lin.bean;
/*
*@author linone
*/
public class Student {
 private int age;
 private String name;
 private String sex;
 public Car getCar() {
	return car;
}
public void setCar(Car car) {
	this.car = car;
}
private Car car;
public Student(int age,String name,String sex) {
	super();
	System.out.println("调用了有参的构造");
	this.age = age;
	this.name = name;
	this.sex = sex;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public Student() {
	super();
	
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}
@Override
public String toString() {
	return "Student [age=" + age + ", name=" + name + ", sex=" + sex + ", car=" + car + "]";
}


 
}
