package com.lin.httpservletrequest;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ����1 ��ȡ����ͷ��Ϣ Servlet implementation class demo1
 */
@WebServlet("/demo1")
public class demo1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public demo1() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String header2 = request.getHeader("host");//��ȡ����һ������ͷ����Ϣ
		System.out.println(header2);
		Enumeration<String> headerNames = request.getHeaderNames();//������ȡ��������ͷ �ٸ�������ͷ��ȡ������
		while (headerNames.hasMoreElements()) {
			String string = (String) headerNames.nextElement();
			String header = request.getHeader(string);
			System.out.println(string + "" + header);

		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
