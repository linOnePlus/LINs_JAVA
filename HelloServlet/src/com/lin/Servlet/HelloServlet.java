package com.lin.Servlet;
import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class HelloServlet implements Servlet{

	@Override
	//sevlet����ʱ ����tomcat�Ƴ� ������TOMcat�����ر�ʱ �ͻ���ø÷�����
	public void destroy() {
	}

	@Override
	public ServletConfig getServletConfig() {
		return null;
	}

	@Override
	public String getServletInfo() {
		return null;
	}

	@Override
	//init ���� ����Sevlet�����ʱ��ص��� ���ƹ��캯�� ֻ��ִ��һ��
	public void init(ServletConfig config) throws ServletException {
	}

	@Override
	//ÿ�ε��ø�Servlet�ͻ���ø÷���
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
System.out.println("lin's first servlet");	
	}

}
