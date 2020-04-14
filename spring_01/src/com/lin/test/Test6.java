package com.lin.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
*@author linone
测试通过factorybean方式来配置bean
*/
public class Test6 {
public static void main(String[] args) {
	 
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans_beanFactory.xml");
	Object bean = applicationContext.getBean("car");
	System.out.println(bean);
	//实际上通过factorybean的getObject方法来配置bean
}
}
