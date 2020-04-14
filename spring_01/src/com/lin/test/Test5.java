package com.lin.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
*@author linone
*测试工厂方法来获取bean
*
*/
public class Test5 {
public static void main(String[] args) {
	ApplicationContext applicationContext= new ClassPathXmlApplicationContext("beans_factory.xml");
	//测试静态工厂方法
	Object bean = applicationContext.getBean("car2");
	System.out.println(bean);
}
}
