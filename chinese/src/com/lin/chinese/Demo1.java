package com.lin.chinese;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *httprequest获取中文参数的问题 
 *不能在地址栏前面直接写数据  tomcat不允许
 *
 *REQUEST请求默认用ISO-8859-1对提交过来的 属性进行解码
 *JSP用的是gbk (可以自己制定) 
 *所以要用STRING构造方法进行解码
 */
public class Demo1 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String parameter = request.getParameter("username");
		System.out.println(new String(parameter.getBytes("ISO-8859-1"), "GBK"));
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
