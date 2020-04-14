package com.lin.dao;

import java.util.List;

import com.lin.pojo.Order;
import com.lin.pojo.OrderUser;

/*
*@author linone
*/
public interface OrderDao {
	/**
	 * 测试resulttype一对一查询
	 * @return
	 */
	List<OrderUser> getOrderUser ();
	/**
	 * 测试resultMap一对一查询
	 * @return
	 */
	List<Order> getOrderUserResultMap();
}
