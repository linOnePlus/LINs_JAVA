package com.lin.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletContext03
 */
@WebServlet("/ServletContext03")
public class ServletContext03 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String parameter = request.getParameter("username");
		String parameter2 = request.getParameter("password");
		System.out.println(parameter+""+parameter2);
	/*	if (parameter=="admin"&& parameter2=="123") 不能用这样判断两个字符串相等 每个字符串都是一个对象*/
		if (parameter.equals("admin")&&parameter2.equals("123")) {
			//设置状态码 能跳转到其他网页
			response.setStatus(302);
			//设置定位跳转的位置 第一个参数固定 第二个参数为目标位置
			response.setHeader("Location", "succeed.html");
			System.out.println(parameter+""+parameter2);
			int totalcount=0;
			System.out.println("已知登陆成功人数"+totalcount);
			int all=totalcount+1;
			getServletContext().setAttribute("count", all);
			Object attribute = getServletContext().getAttribute("count");
			if (attribute!=null) {
				totalcount= (int) attribute;
			}
		}else {
			PrintWriter writer = response.getWriter();
			writer.write("sorry login fail");
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
