package cn.campus.Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.campus.dao.Userdao;
import cn.campus.dao.impl.Userdaoimpl;

/**
 * 用户登录的servlet
 */
@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 处理中文乱码
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");

		String usname = request.getParameter("username");
		String pwd = request.getParameter("password");
		Userdao dao = new Userdaoimpl();
		boolean issuccess = dao.login(usname, pwd);
		if (issuccess) {
			System.out.println("登录名" + usname);
			//登录成功的话将usname存到session中
			HttpSession session = request.getSession();
			
			session.setAttribute("username", usname);
			response.sendRedirect("index.jsp");
		} else {
			response.sendRedirect("login.jsp");
		}

		doGet(request, response);
	}

}
