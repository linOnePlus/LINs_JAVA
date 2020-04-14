package com.lin.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lin.bean.Product3;

/*
*@author linone
*/
public class Test3 {
public static void main(String[] args) {
	
	ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml"} );
	Product3 p3 = (Product3) context.getBean("p3");
	System.out.println(p3.getCategory2().getName());
}
}
