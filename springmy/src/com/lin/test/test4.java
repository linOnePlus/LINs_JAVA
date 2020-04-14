package com.lin.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.lin.bean.Product3;

/*
*@注解方式拿到BEan
*/
public class test4 {
public static void main(String[] args) {
	
	ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "applicationContext2.xml" });
	Product3 p = (Product3) context.getBean("p3");
	System.out.println(p.getName());
	System.out.println(p.getCategory2().getName());
}
}
