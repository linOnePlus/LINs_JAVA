package com.lin.Servlet;
import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class HelloServlet implements Servlet{

	@Override
	//sevlet销毁时 （从tomcat移除 或者是TOMcat正常关闭时 就会调用该方法）
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
	//init 方法 创建Sevlet对象的时候回调用 类似构造函数 只会执行一次
	public void init(ServletConfig config) throws ServletException {
	}

	@Override
	//每次调用改Servlet就会调用该方法
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
System.out.println("lin's first servlet");	
	}

}
