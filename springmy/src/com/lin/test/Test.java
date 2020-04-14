package com.lin.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lin.bean.Category;
import com.lin.bean.Product;

/*
*@author linone
*��ʾͨ��spring��ȡCategory�����Լ��ö���ע���name���ԡ�
��ͼ��ʾ�����Դ�ӡ��ͨ��Spring�õ���Category�����name����
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
