package com.lin.chinese;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *httprequest��ȡ���Ĳ��������� 
 *�����ڵ�ַ��ǰ��ֱ��д����  tomcat������
 *
 *REQUEST����Ĭ����ISO-8859-1���ύ������ ���Խ��н���
 *JSP�õ���gbk (�����Լ��ƶ�) 
 *����Ҫ��STRING���췽�����н���
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
