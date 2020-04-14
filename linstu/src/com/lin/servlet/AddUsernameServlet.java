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
 * ��������û���������Ŀ��Ʋ�
 */
@WebServlet("/AddUsernameServlet")
public class AddUsernameServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println("ע��ҳ���õ����û�����"+username+"�õ���������"+password);
		UserService service = new  UserServiceImpl();
		int insertUser;
		try {
			insertUser = service.insertUser(username, password);
			System.out.println("�����û��ķ����ķ���ֵ��"+insertUser);
			if (insertUser > 0) {
				request.getRequestDispatcher("logging.jsp").forward(request, response);
			}else {
				response.getWriter().write("�ڲ�����������");
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
