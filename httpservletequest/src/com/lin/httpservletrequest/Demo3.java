package com.lin.httpservletrequest;
//������������  �����ڵ�ַ��ֱ���������� tomcat������ Ҫ�ο�chinese��Ŀ
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Demo3")
public class Demo3 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String parameter = request.getParameter("name");
		System.out.println(new String(parameter.getBytes("ISO-8859-1"), "UTF-8"));
	}

}
