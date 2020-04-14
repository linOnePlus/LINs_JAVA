package com.lin.Servlet;

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
		
		request.setCharacterEncoding("UTF-8");
		//1.�õ��ύ�������û���  request.send()
		String username = request.getParameter("username");
		System.out.println(username);
		//2.�����ݿ� ���ز鵽0���߷�0 
		UsernameDao dao = new UsernameDaoimpl();
		try {
			int checkUsername = dao.checkUsername(username);
			//������Ӧ����
			response.getWriter().println(checkUsername);
			System.out.println(checkUsername);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
