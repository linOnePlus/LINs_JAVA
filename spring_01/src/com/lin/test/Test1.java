package com.lin.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lin.bean.Banji;
import com.lin.bean.Person;
import com.lin.bean.School;
import com.lin.bean.Student;

/* 
*@author linone
*/
public class Test1 {
	public static void main(String[] args) {
		// 创建IOC容器
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 从容器里面获得Bean 通过ID
		Person p = (Person) applicationContext.getBean("person");
		p.hello();
		System.out.println(p);
		// 通过字节码获得BEAN
		Student student = applicationContext.getBean(Student.class);
		System.out.println(student);
		//测试内部Bean
		Person p2 = (Person) applicationContext.getBean("person2");
		System.out.println(p2);
		// 测试LIst集合注入
		School bean = (School)applicationContext.getBean("school");
		System.out.println(bean);
		//测试MAp集合注入
		Banji banji = (Banji)applicationContext.getBean("banji");
		System.out.println(banji);
		//测试自动装配
		Person p9 = (Person) applicationContext.getBean("person9");
		System.out.println(p9);
		//测试继承关系
		Person p8 = (Person) applicationContext.getBean("person8");
		System.out.println(p8);
		//测试抽象继承关系
		Person p1010 = (Person) applicationContext.getBean("person1010");
		System.out.println(p1010);
	}
}
