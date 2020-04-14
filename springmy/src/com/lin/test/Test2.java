package com.lin.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lin.bean.Product2;

/*
*@author linone
*/
public class Test2 {
public static void main(String[] args) {

			ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "applicationContext.xml" });

			Product2 p = (Product2) context.getBean("p2");

			System.out.println(p.getName());
			System.out.println(p.getCategory().getName());
		}

}

