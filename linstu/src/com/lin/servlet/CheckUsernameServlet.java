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
 * 校验用户名是否已经存在
 */
@WebServlet("/CheckUsernameServlet")
public class CheckUsernameServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		// 1.拿到提交上来的用户名 request.send()
		String username = request.getParameter("username");
		System.out.println("ajax拿到的数据是" + username);
		// 2.查数据库 返回查到0或者非0
		UserService service = new UserServiceImpl();
		try {
			int checkUsername = service.checkUsernameCount(username);
			// 返回响应数据  String类型
			response.getWriter().println(checkUsername);
			System.out.println("后台查到的用户名数量是"+checkUsername);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
