package com.lin.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lin.bean.Student;

/*
 * ����������
*@author linone
*/
public class Test2 {
public static void main(String[] args) {
	
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext2.xml");
	Student student = (Student) applicationContext.getBean("student");
	Student student2 = (Student) applicationContext.getBean("student");
	//singleton������ ���������Ķ������ͬ
	System.out.println(student==student2);
	
    Student student3 = (Student) applicationContext.getBean("student2");
    Student student4 = (Student) applicationContext.getBean("student2");
    //prototype��������������ͬ ÿ������������һ�������ʱ��ͻᴴ��һ������
    System.out.println(student3==student4);
	
}
}
