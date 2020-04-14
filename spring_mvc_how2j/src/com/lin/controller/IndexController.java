package com.lin.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/*
*@author linone
*����indexҳ������
*����ǰ�����@Controller ��ʾ������һ��������
�ڷ���handleRequest ǰ����� @RequestMapping("/index") ��ʾ·��/index��ӳ�䵽�÷�����
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
