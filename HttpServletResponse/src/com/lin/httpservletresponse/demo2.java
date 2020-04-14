package com.lin.httpservletresponse;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 字符流和字节流输出中文内容时候 出现乱码怎么处理 Servlet implementation class demo2
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
		//getoutputstream 和getwriter在servlet中不能同时用
		 //Writer(response); 
		
		 //设置浏览器的看数据时候使用的编码
		  response.setHeader("Content-Type", "text/html;charaset=UTF-8");
		 //getbytes()方法默认是用Utf-8输出字符 不是 我这里是GBK
		  response.getOutputStream().write("你是".getBytes());
		
	}

	private void Writer(HttpServletResponse response) throws IOException {
		/* 设置输出的编码 */
		response.setCharacterEncoding("UTF-8");
		response.setHeader("Content-Type", "text/html;charaset=UTF-8");
		response.getWriter().write("你好");
		/* 设置客户端接收时候 ，用什么编码 */
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
