package com.lin.bean;
/*
*@author linone
*演示BEAN的生命周期
*/
public class Car2 {
 public Car2() {
	 System.out.println("constructor");
 }
 private String brand;
 public void setBrand(String brand) {
	 System.out.println("set方法执行了");
	this.brand = brand;
}
 public void init() {
	 System.out.println("init方法调用了");
 }
 public void destory() {
	 System.out.println("destory方法调用了");
 }
@Override
public String toString() {
	return "Car2 [brand=" + brand + "]";
}
}
