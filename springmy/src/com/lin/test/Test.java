package com.lin.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lin.bean.Category;
import com.lin.bean.Product;

/*
*@author linone
*演示通过spring获取Category对象，以及该对象被注入的name属性。
如图所示，可以打印出通过Spring拿到的Category对象的name属性
*/
public class Test {

	public static void main(String[] args) {
ApplicationContext applicationContext = new ClassPathXmlApplicationContext( new String[] {"applicationContext.xml"});
Category c  = (Category) applicationContext.getBean("c");
System.out.println(c.getId());

ApplicationContext applicationContext2 = new  ClassPathXmlApplicationContext(new String[] {"applicationContext.xml"});
Product p = (Product) applicationContext2.getBean("p");
System.out.println(p.getName()+" "+p.getPrice());
	}

}
