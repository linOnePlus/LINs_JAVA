package com.lin.bean;
/*
*@author linone
*��ʾBEAN����������
*/
public class Car2 {
 public Car2() {
	 System.out.println("constructor");
 }
 private String brand;
 public void setBrand(String brand) {
	 System.out.println("set����ִ����");
	this.brand = brand;
}
 public void init() {
	 System.out.println("init����������");
 }
 public void destory() {
	 System.out.println("destory����������");
 }
@Override
public String toString() {
	return "Car2 [brand=" + brand + "]";
}
}
