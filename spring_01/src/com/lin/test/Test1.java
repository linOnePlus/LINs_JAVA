package com.lin.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lin.bean.Banji;
import com.lin.bean.Person;
import com.lin.bean.School;
import com.lin.bean.Student;

/* 
*@author linone
*/
public class Test1 {
	public static void main(String[] args) {
		// ����IOC����
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		// ������������Bean ͨ��ID
		Person p = (Person) applicationContext.getBean("person");
		p.hello();
		System.out.println(p);
		// ͨ���ֽ�����BEAN
		Student student = applicationContext.getBean(Student.class);
		System.out.println(student);
		//�����ڲ�Bean
		Person p2 = (Person) applicationContext.getBean("person2");
		System.out.println(p2);
		// ����LIst����ע��
		School bean = (School)applicationContext.getBean("school");
		System.out.println(bean);
		//����MAp����ע��
		Banji banji = (Banji)applicationContext.getBean("banji");
		System.out.println(banji);
		//�����Զ�װ��
		Person p9 = (Person) applicationContext.getBean("person9");
		System.out.println(p9);
		//���Լ̳й�ϵ
		Person p8 = (Person) applicationContext.getBean("person8");
		System.out.println(p8);
		//���Գ���̳й�ϵ
		Person p1010 = (Person) applicationContext.getBean("person1010");
		System.out.println(p1010);
	}
}
