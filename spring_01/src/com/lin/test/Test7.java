package com.lin.test;
/*
*@author linone
*²âÊÔ×¢½â
*/

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lin.annotation.TestObject;
import com.lin.annotation.Controller.Controller;

public class Test7 {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext ("bean_annotation.xml");
		TestObject testobject = (TestObject) applicationContext.getBean("linzejia");
		System.out.println(testobject);
		
		Controller c = (Controller) applicationContext.getBean("controller");
		System.out.println(c);
		c.saveC();
		
	}
}
