package com.lin.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
*@author linone
����ͨ��factorybean��ʽ������bean
*/
public class Test6 {
public static void main(String[] args) {
	 
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans_beanFactory.xml");
	Object bean = applicationContext.getBean("car");
	System.out.println(bean);
	//ʵ����ͨ��factorybean��getObject����������bean
}
}
