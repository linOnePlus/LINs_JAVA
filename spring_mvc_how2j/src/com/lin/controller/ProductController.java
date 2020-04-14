package com.lin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lin.bean.Product;

/*
*@author linone
*/
@org.springframework.stereotype.Controller
public class ProductController{

	
	/**
	 * 注： addProduct.jsp 提交的name和price会自动注入到参数 product里
              注： 参数product会默认被当做值加入到ModelAndView 中，相当于：
              mav.addObject("product",product);
	 */
	@RequestMapping("/addProduct")
	public ModelAndView add(Product product) throws Exception {
		ModelAndView andView = new ModelAndView("showProduct");
		return andView;
	}
	
}
