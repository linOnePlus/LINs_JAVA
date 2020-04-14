package com.lin.ssm.crm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lin.ssm.crm.mapper.CustomerMapper;
import com.lin.ssm.crm.pojo.Customer;
import com.lin.ssm.crm.pojo.QueryVo;
import com.lin.ssm.crm.utils.Page;

/*
*@author linoneplus
*/
@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerMapper customermapper;
	
	@Override
	public Page<Customer> queryCustomerByQueryVo(QueryVo queryVo) {
		//设置从哪个索引开始查 ，后面查询集合需要用到这个数据
	   queryVo.setStart((queryVo.getPage()-1)*queryVo.getRows());
	   List<Customer> list = customermapper.queryByQueryVo(queryVo);
	   int countByQueryVo = customermapper.queryCountByQueryVo(queryVo);
	   //封装成pagebean返回给前台页面
	   Page<Customer> page =new Page<Customer>
	   (countByQueryVo, queryVo.getPage(), queryVo.getRows(), list);
		return page;
	}

	@Override
	public Customer queryCustomerById(Long id) {
		return customermapper.queryCustomerById(id);
	}

	@Override
	public void updateCustomer(Customer customer) {
		 customermapper.updateCustomer(customer);
	}

	@Override
	public void deleteCustomer(Long id) {
		customermapper.deleteCustomer(id);
	}

}
