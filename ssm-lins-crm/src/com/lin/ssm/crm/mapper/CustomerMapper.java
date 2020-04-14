package com.lin.ssm.crm.mapper;
/*
 *客户信息数据持久化接口
*@author linoneplus
*/

import java.util.List;

import com.lin.ssm.crm.pojo.Customer;
import com.lin.ssm.crm.pojo.QueryVo;

public interface CustomerMapper {

	/**
	 * 根据queryvo接受的条件查询数据
	 */
	List<Customer> queryByQueryVo(QueryVo vo);
	
	/**
	 * 根据queryvo接受的条件查询数据总数
	 */
	int queryCountByQueryVo(QueryVo vo);
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
