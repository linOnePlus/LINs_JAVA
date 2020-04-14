package com.lin.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/*
*@author linone
*处理index页面请求
*在类前面加上@Controller 表示该类是一个控制器
在方法handleRequest 前面加上 @RequestMapping("/index") 表示路径/index会映射到该方法上
*/
@org.springframework.stereotype.Controller
public class IndexController implements Controller{

	@Override
	@RequestMapping("/index")
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		ModelAndView andView = new ModelAndView("index.jsp");
		andView.addObject("message","hello linmvc");
		System.out.println(andView);
		return andView;
	}

}
