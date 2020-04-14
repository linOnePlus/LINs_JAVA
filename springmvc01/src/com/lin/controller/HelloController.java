package com.lin.controller;
/*
*@author linone
*/
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("hello")
	public ModelAndView hello() {
		System.out.println("hello spring mvc");
		ModelAndView mav = new ModelAndView();
		//设置模型数据
		mav.addObject("msg", "hello spring mvc...");
		//设置视图名字
		mav.setViewName("WEB-INF/jsp/hello.jsp");
		return mav;
	}
}
