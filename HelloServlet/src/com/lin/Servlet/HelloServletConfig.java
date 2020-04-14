package com.lin.Servlet;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServletConfig extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	ServletConfig sc = getServletConfig();//httpservlet的父类中的方法
	String servletName = sc.getServletName();//获取xml中注册的servlet-name
	System.out.println(servletName);
	String initParameter = sc.getInitParameter("value");//获取单个参数
		/*
		 * if (initParameter=="99") { throw new ClassCastException("number wrong"); }
		 */
	System.out.println(initParameter);
	Enumeration<String> initParameterNames = sc.getInitParameterNames();//获取所有参数名称的枚举
	while (initParameterNames.hasMoreElements()) {//遍历取出所有参数名称 alt +/
		String string = (String) initParameterNames.nextElement();
		String initParameter2 = sc.getInitParameter(string);//取出参数名称对应的值
		System.out.println(string+"  "+initParameter2);
		
	}
	
}
@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
