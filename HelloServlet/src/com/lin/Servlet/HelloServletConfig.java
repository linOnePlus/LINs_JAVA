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
	
	ServletConfig sc = getServletConfig();//httpservlet�ĸ����еķ���
	String servletName = sc.getServletName();//��ȡxml��ע���servlet-name
	System.out.println(servletName);
	String initParameter = sc.getInitParameter("value");//��ȡ��������
		/*
		 * if (initParameter=="99") { throw new ClassCastException("number wrong"); }
		 */
	System.out.println(initParameter);
	Enumeration<String> initParameterNames = sc.getInitParameterNames();//��ȡ���в������Ƶ�ö��
	while (initParameterNames.hasMoreElements()) {//����ȡ�����в������� alt +/
		String string = (String) initParameterNames.nextElement();
		String initParameter2 = sc.getInitParameter(string);//ȡ���������ƶ�Ӧ��ֵ
		System.out.println(string+"  "+initParameter2);
		
	}
	
}
@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
