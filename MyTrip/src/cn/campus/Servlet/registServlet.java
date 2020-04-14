package cn.campus.Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.campus.Bean.Userbean;
import cn.campus.dao.Userdao;
import cn.campus.dao.impl.Userdaoimpl;

/**
 * 处理注册功能的Servlet Servlet implementation class registServlet
 */
@WebServlet("/registServlet")
public class registServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public registServlet() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 处理中文乱码
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");

		String usname = request.getParameter("username");
		String pwd = request.getParameter("password");
		String rpwd = request.getParameter("repassword");
		String number = request.getParameter("phone");
		String email = request.getParameter("email");

		Userbean user = new Userbean();
		user.setUsname(usname);
		user.setPwd(pwd);
		user.setRpwd(rpwd);
		user.setNumber(number);
		user.setEmail(email);

		Userdao a = new Userdaoimpl();
		int success = a.regist(user);
		
		

		if (success > 0 ) {
			response.sendRedirect("index.jsp");
		} else {
			response.sendRedirect("regist.jsp");
			

		}
		doGet(request, response);
	}

}
