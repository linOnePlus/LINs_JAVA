package com.lin.httpservletresponse;

import java.io.IOException;
import java.nio.charset.Charset;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 解决乱码通用方法
 *response.setContentType("text/html;charset=UTF-8");
 */
@WebServlet("/demo3")
public class demo3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public demo3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//通用方法 设置响应的数据类型是html文本，并且告知浏览器，使用UTF-8 来编码。 
		response.setContentType("text/html;charset=UTF-8");
		//response.setHeader("Content-Type", "text/html;charset=UTF-8");
		response.getOutputStream().write("你号码你是谁呢".getBytes("UTF-8"));
         String csn = Charset.defaultCharset().name();
		 System.out.println("默认的String里面的getBytes方法使用的码表是： "+ csn);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
