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
 * У���û����Ƿ��Ѿ�����
 */
@WebServlet("/CheckUsernameServlet")
public class CheckUsernameServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		// 1.�õ��ύ�������û��� request.send()
		String username = request.getParameter("username");
		System.out.println("ajax�õ���������" + username);
		// 2.�����ݿ� ���ز鵽0���߷�0
		UserService service = new UserServiceImpl();
		try {
			int checkUsername = service.checkUsernameCount(username);
			// ������Ӧ����  String����
			response.getWriter().println(checkUsername);
			System.out.println("��̨�鵽���û���������"+checkUsername);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
