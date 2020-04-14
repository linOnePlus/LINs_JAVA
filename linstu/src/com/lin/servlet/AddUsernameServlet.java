package com.lin.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lin.service.UserService;
import com.lin.serviceimpl.UserServiceImpl;

/**
 * 负责添加用户名和密码的控制层
 */
@WebServlet("/AddUsernameServlet")
public class AddUsernameServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println("注册页面拿到的用户名是"+username+"拿到的密码是"+password);
		UserService service = new  UserServiceImpl();
		int insertUser;
		try {
			insertUser = service.insertUser(username, password);
			System.out.println("增加用户的方法的返回值是"+insertUser);
			if (insertUser > 0) {
				request.getRequestDispatcher("logging.jsp").forward(request, response);
			}else {
				response.getWriter().write("内部服务器错误");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
}
}
