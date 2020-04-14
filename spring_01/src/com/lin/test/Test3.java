package com.lin.test;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lin.bean.Student;

/*
*@author linone
*��ʾSpring���ͨ���ⲿ�����ļ�����ȡ���ӳض���
*/
public class Test3 {
public static void main(String[] args) {
	
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans_properties.xml");
	DataSource ds = (DataSource) applicationContext.getBean("datasource");
	System.out.println(ds);
	
	//����Spel
ApplicationContext applicationContext2 = new ClassPathXmlApplicationContext("bean_spel.xml");
Student stu = (Student) applicationContext2.getBean("Student");
System.out.println(stu);
}
}
