package com.lin.cookie;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Demo2
 */
@WebServlet("/Demo2")
public class Demo2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Demo2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie cookie= new Cookie("lin", "23");
		cookie.setMaxAge(30);//����cookie����Чʱ��ֵ �������
		/*
		 * // cookie.setDomain(".baidu.com");//���ʸ������Ż���ϸ�cookie //
		 * cookie.setPath("/cookie/Demo2");//���ʸ������µ�·���Ż���ϸ�cookie
		 */	
		response.addCookie(cookie);
		Cookie[] cookies = request.getCookies();
		if (cookies!=null) {
			for (Cookie cookie2 : cookies) {
				System.out.println(cookie2.getName()+" "+cookie2.getValue());
			}
			cookie.setValue("41");//�޸�cookie��ֵ
			response.addCookie(cookie);//�����cookie
			Cookie[] cookies2 = request.getCookies();
			if (cookies2!=null) {
				for (Cookie cookie2 : cookies2) {
					
					System.out.println(cookie2.getName()+" "+cookie2.getValue());
				}
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
