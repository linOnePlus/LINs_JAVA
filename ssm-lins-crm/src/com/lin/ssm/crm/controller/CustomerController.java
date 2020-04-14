package com.lin.ssm.crm.controller;

import java.io.UnsupportedEncodingException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.druid.util.StringUtils;
import com.lin.ssm.crm.pojo.Base_dict;
import com.lin.ssm.crm.pojo.Customer;
import com.lin.ssm.crm.pojo.QueryVo;
import com.lin.ssm.crm.service.Base_dictService;
import com.lin.ssm.crm.service.CustomerService;
import com.lin.ssm.crm.utils.Page;

/*
*@author linone
*/
@Controller
@RequestMapping("customer")
public class CustomerController {
	
	@Autowired
	private Base_dictService service;
	@Autowired
	private CustomerService customerservice;
	
	@Value("${fromType}")
	private String fromType;
	@Value("${industryType}")
	private String industryType;
	@Value("${levelType}")
	private String levelType;

	/**
	 * 测试环境搭建是否成功
	 */
	@RequestMapping("test")
	public String testEnvironment() {
		System.out.println("environment build successfully");
		return "customer";
	}
	/**
	 * 测试自定义标签栏
	 */
	@RequestMapping("mytag")
	public String testMyTag() {
		return "testtag";
	}
	
	/**
	 * 查询条件显示
	 */
	@RequestMapping("list.action")
	public String queryList(Model model,QueryVo vo) {
		//查询客户来源
		List<Base_dict> fromType = service.queryBaseDictByDictTypeCode(this.fromType);
		//查询客户行业
		 List<Base_dict> industryType = service.queryBaseDictByDictTypeCode(this.industryType);
		//查询客户级别
		List<Base_dict> levelType = service.queryBaseDictByDictTypeCode(this.levelType);
		model.addAttribute("fromType", fromType);
		model.addAttribute("industryType", industryType);
		model.addAttribute("levelType", levelType);
		
		//处理中文名字乱码问题
	if (!StringUtils.isEmpty(vo.getCustName())) {
		try {
			vo.setCustName(new String(vo.getCustName().getBytes("ISO-8859-1"), "UTF-8"));
			System.out.println("queryvo中custName是"+vo.getCustName());
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
		//返回查询结果
		Page<Customer> page = customerservice.queryCustomerByQueryVo(vo);
		model.addAttribute("page",page);
		List<Customer> list2 = page.getRows();
		for (Customer customer : list2) {
			System.out.println("查出的数据是"+customer);
		}
		
		//查询条件数据显示
	   model.addAttribute("custName", vo.getCustName());
	   model.addAttribute("custSource", vo.getCustSource());
	   model.addAttribute("custIndustry", vo.getCustIndustry());
	   model.addAttribute("custLevel", vo.getCustLevel());
		return "customer";
	}
	
	/**
	 * 修改信息时数据回显
	 */
	@RequestMapping("edit")
	public @ResponseBody Customer queryCustomerById(Long id) {
		Customer customer = customerservice.queryCustomerById(id);
		return customer;
	}
	/**
	 * 修改客户信息
	 */
	@RequestMapping("update")
	@ResponseBody//目的是把字符串返回 而不是当成视图
	public String updateCustomer(Customer customer) {
		String msg ="0";
		try {
		customerservice.updateCustomer(customer);
		msg="1";
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("更新的结果是"+msg);
	   return msg;
	}
	
	@RequestMapping("delete")
	@ResponseBody//目的是把字符串返回 而不是当成视图
	public String deleteCustomer(Long id) {
		String msg ="0";
		try {
			customerservice.deleteCustomer(id);
			msg="1";
		} catch (Exception e) {
			// TODO: handle exception
		}
		return msg;
	}
}
