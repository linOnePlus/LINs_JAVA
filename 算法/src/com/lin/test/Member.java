package com.lin.test;
/*
*@author linoneplus
*/
public class Member {

	String name;
	int  age = 0;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
		System.out.println("局部变量age is " +age);
	}
	public void testMum() {
		System.out.println("成员变量age is "+this.age);
	}

}

class domain{
	public static void main(String[] args) {
		Member member =  new  Member();
		member.setAge(20);
		member.testMum();
		
	}
}