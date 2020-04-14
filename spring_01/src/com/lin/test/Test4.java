package com.lin.test;
/*
*@author linone
*≤‚ ‘bean…˙√¸÷‹∆⁄
*/

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
public static void main(String[] args) {
	ClassPathXmlApplicationContext applicationContext= new ClassPathXmlApplicationContext("beans_cycle.xml");
	Object bean = applicationContext.getBean("car2");
	System.out.println(bean);
	applicationContext.close();
	
}
}
