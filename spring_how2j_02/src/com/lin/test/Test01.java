package com.lin.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lin.how2j.spring.service.ProductService;

/*
*@author linone
*/
public class Test01 {
public static void main(String[] args) {
	
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
	ProductService productService = (ProductService) applicationContext.getBean("productService");
	productService.doSomeService();
}
}
