package com.lin.test;

import static org.junit.Assert.*;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.lin.dao.OrderDao;
import com.lin.dao.UserDao;
import com.lin.pojo.Order;
import com.lin.pojo.OrderUser;
import com.lin.utils.SqlSessionFactoryUtil;

/*
*@author linone
*/
public class OrderDaoTest {


@Test
  public  void testgetOderUser() {
	SqlSession session = SqlSessionFactoryUtil.getSsf().openSession();
	 OrderDao mapper = session.getMapper(OrderDao.class);
	List<OrderUser> orderUser = mapper.getOrderUser();
	for (OrderUser orderUser2 : orderUser) {
		System.out.println(orderUser2);
	}
	session.close();
}

  @Test
  public void testgetOrderUserMap() {
	  SqlSession sqlSession = SqlSessionFactoryUtil.getSsf().openSession();
	  OrderDao mapper = sqlSession.getMapper(OrderDao.class);
	  List<Order> orderUserResultMap = mapper.getOrderUserResultMap();
	  for (Order order : orderUserResultMap) {
		System.out.println(order);
		System.out.println("此订单的用户是"+order.getUser());
	}
	  sqlSession.close();
  }
  
}
