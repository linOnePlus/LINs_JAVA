package com.lin.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lin.dao.UsernameDao;
import com.lin.dao.impl.UsernameDaoimpl;

/**
 * Servlet implementation class CheckUsernameServlet
 */
@WebServlet("/CheckUsernameServlet")
public class CheckUsernameServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("������");
		String name = request.getParameter("name");
		System.out.println(name);
		UsernameDao dao =new UsernameDaoimpl();
		try {
			int checkUsername = dao.checkUsername(name);
			response.getWriter().println(checkUsername);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
