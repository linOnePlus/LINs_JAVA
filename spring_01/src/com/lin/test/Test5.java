package com.lin.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
*@author linone
*���Թ�����������ȡbean
*
*/
public class Test5 {
public static void main(String[] args) {
	ApplicationContext applicationContext= new ClassPathXmlApplicationContext("beans_factory.xml");
	//���Ծ�̬��������
	Object bean = applicationContext.getBean("car2");
	System.out.println(bean);
}
}
