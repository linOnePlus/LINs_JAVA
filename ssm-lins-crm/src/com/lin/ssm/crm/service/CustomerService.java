package com.lin.ssm.crm.service;
/*
 * 客户信息业务逻辑接口
*@author linoneplus
*/

import com.lin.ssm.crm.pojo.Customer;
import com.lin.ssm.crm.pojo.QueryVo;
import com.lin.ssm.crm.utils.Page;

public interface CustomerService {

	/**
	 * 根据条件分页查询客户信息
	 */
	Page<Customer> queryCustomerByQueryVo(QueryVo queryVo);
	/**
	 * 根据id查找customer
	 */
	Customer queryCustomerById(Long id);
	/**
	 * 更新客户信息
	 * 
	 */
	void updateCustomer(Customer customer);
	
	/**
	 * 删除客户信息
	 * @param 客户id
	 */
	void deleteCustomer(Long id);
}
