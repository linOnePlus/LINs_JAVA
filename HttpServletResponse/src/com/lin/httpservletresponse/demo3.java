package com.lin.httpservletresponse;

import java.io.IOException;
import java.nio.charset.Charset;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * �������ͨ�÷���
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
		//ͨ�÷��� ������Ӧ������������html�ı������Ҹ�֪�������ʹ��UTF-8 �����롣 
		response.setContentType("text/html;charset=UTF-8");
		//response.setHeader("Content-Type", "text/html;charset=UTF-8");
		response.getOutputStream().write("���������˭��".getBytes("UTF-8"));
         String csn = Charset.defaultCharset().name();
		 System.out.println("Ĭ�ϵ�String�����getBytes����ʹ�õ�����ǣ� "+ csn);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
