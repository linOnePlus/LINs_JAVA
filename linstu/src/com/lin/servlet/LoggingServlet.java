package com.lin.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lin.bean.User;
import com.lin.service.UserService;
import com.lin.serviceimpl.UserServiceImpl;

/**
 *�������¼У�鹦�� Servlet implementation class LoggingServlet
 */
@WebServlet("/LoggingServlet")
public class LoggingServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		String username = request.getParameter("username");
		String password = request.getParameter("password");	
		System.out.println(username+password);
		User user = new User(username, password);
		UserService  us = new UserServiceImpl();
		try {
			boolean result = us.checkUser(user);
			System.out.println("username is "+username+"password is"+password);
			System.out.println(result);
			response.getWriter().print(result);//��ǰ��ҳ�洫һ��String���͵Ĳ�ѯ���
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
