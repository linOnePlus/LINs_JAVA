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
	 * ע�� addProduct.jsp �ύ��name��price���Զ�ע�뵽���� product��
              ע�� ����product��Ĭ�ϱ�����ֵ���뵽ModelAndView �У��൱�ڣ�
              mav.addObject("product",product);
	 */
	@RequestMapping("/addProduct")
	public ModelAndView add(Product product) throws Exception {
		ModelAndView andView = new ModelAndView("showProduct");
		return andView;
	}
	
}
