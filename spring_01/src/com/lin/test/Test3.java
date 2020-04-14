package com.lin.test;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lin.bean.Student;

/*
*@author linone
*演示Spring如何通过外部配置文件来获取连接池对象
*/
public class Test3 {
public static void main(String[] args) {
	
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans_properties.xml");
	DataSource ds = (DataSource) applicationContext.getBean("datasource");
	System.out.println(ds);
	
	//测试Spel
ApplicationContext applicationContext2 = new ClassPathXmlApplicationContext("bean_spel.xml");
Student stu = (Student) applicationContext2.getBean("Student");
System.out.println(stu);
}
}
