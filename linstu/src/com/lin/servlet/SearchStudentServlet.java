package com.lin.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lin.bean.Student;
import com.lin.service.StudentService;
import com.lin.serviceimpl.StudentServiceImpl;

/**
 *����ģ����ѯ
 */
@WebServlet("/SearchStudentServlet")
public class SearchStudentServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//1.��������
		request.setCharacterEncoding("UTF-8");
		String sname = request.getParameter("sname");
		String sgender = request.getParameter("sgender");
		System.out.println(sname + sgender);
		//2.��Service������ݿ�
		StudentService service = new StudentServiceImpl();
		try {
			List<Student> list = service.searchStudent(sname, sgender);
			//�����ݵ�������
			request.setAttribute("list", list);
		} catch (SQLException e) {
			e.printStackTrace();
		}
//3.��ת��view��
		request.getRequestDispatcher("showlist.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}