package com.lin.httpservletresponse;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * �ַ������ֽ��������������ʱ�� ����������ô���� Servlet implementation class demo2
 */
@WebServlet("/demo2")
public class demo2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public demo2() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//getoutputstream ��getwriter��servlet�в���ͬʱ��
		 //Writer(response); 
		
		 //����������Ŀ�����ʱ��ʹ�õı���
		  response.setHeader("Content-Type", "text/html;charaset=UTF-8");
		 //getbytes()����Ĭ������Utf-8����ַ� ���� ��������GBK
		  response.getOutputStream().write("����".getBytes());
		
	}

	private void Writer(HttpServletResponse response) throws IOException {
		/* ��������ı��� */
		response.setCharacterEncoding("UTF-8");
		response.setHeader("Content-Type", "text/html;charaset=UTF-8");
		response.getWriter().write("���");
		/* ���ÿͻ��˽���ʱ�� ����ʲô���� */
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
