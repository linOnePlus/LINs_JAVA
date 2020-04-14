package com.lin.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lin.bean.Student;

/*
 * 测试作用域
*@author linone
*/
public class Test2 {
public static void main(String[] args) {
	
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext2.xml");
	Student student = (Student) applicationContext.getBean("student");
	Student student2 = (Student) applicationContext.getBean("student");
	//singleton作用域 两个创建的对象会相同
	System.out.println(student==student2);
	
    Student student3 = (Student) applicationContext.getBean("student2");
    Student student4 = (Student) applicationContext.getBean("student2");
    //prototype作用域两个对象不同 每次请求容器给一个对象的时候就会创建一个对象
    System.out.println(student3==student4);
	
}
}
