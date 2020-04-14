package com.lin.test;

import java.util.Arrays;
import java.util.List;

import javax.persistence.Temporal;
import javax.transaction.Transaction;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import com.lin.pojo.customer;

/*
*@author linoneplus
*/
public class testday01 {

	@Test
	public void demo1() {
		//加载核心配置文件
		Configuration configuration = new Configuration().configure();
		//创建sessionfactory
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		//创建session
		Session session = sessionFactory.openSession();
		//开启事务
		org.hibernate.Transaction transaction =session.beginTransaction();
		//操作
		customer customer01 = new customer();
		customer01.setCust_name("lin2");
		session.save(customer01);
		
		
		//get/load	 查询方法
		customer customer02 = session.get(customer.class,1l);
//		System.out.println(customer02);
		customer customer03 = session.load(customer.class,1l); //延迟加载 使用对象的时候才加载sql语句
//		System.out.println(customer03);
		
		//修改方法   先查询后修改
		customer customer = session.get(customer.class, 1l);
		customer.setCust_phone("121");
		session.update(customer);
		
		//删除方法 先查询再删除
		com.lin.pojo.customer customer4 = session.load(customer.class, 13l);
		session.delete(customer4);
		
			
		//提交事务
		transaction.commit();
		//
		session.close();
		sessionFactory.close();
	}
	
	@Test
	public  void  demo2() {
		Configuration configuration = new Configuration().configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session openSession = sessionFactory.openSession();
		org.hibernate.Transaction transaction = openSession.beginTransaction();
//		//保存或更新
//		customer customer5 = new customer();
//		customer5.setCust_id(10l);
//		customer5.setCust_mobile("12222313131");
//		openSession.saveOrUpdate(customer5);
		//查询所有 传sql
		SQLQuery query = openSession.createSQLQuery("select * from cst_customer");
		 /**
         * 使用session对象的createSQLQuery方法创建SQLQuery对象。
         * 使用sqlquery对象的list方法获取数据集合,集合里面不是对象，而是数组
         */
		List<Object[]> list = query.list();
		for (Object[] customers : list) {
			System.out.println(Arrays.toString(customers));
		}
		transaction.commit();
		openSession.close();
		sessionFactory.close();
		
	}
}
