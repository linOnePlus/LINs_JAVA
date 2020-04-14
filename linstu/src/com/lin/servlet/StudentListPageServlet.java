package com.lin.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lin.bean.PageBean;
import com.lin.bean.Student;
import com.lin.service.StudentService;
import com.lin.serviceimpl.StudentServiceImpl;

/**
 * ������ҳ��ʾѧ����Ϣ
 */
@WebServlet("/StudentListPageServlet")
public class StudentListPageServlet extends HttpServlet {
	
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1.��ȡ��Ҫ��ʾ��Ϣ��ҳ����
		int currentPage = Integer.parseInt(request.getParameter("currentPage"));
		
		//2.����ҳ������ȡ��Ҫ����Ϣ
		StudentService  service = new StudentServiceImpl();
		try {
			PageBean<Student> pageBean = service.findStudentByPage(currentPage);
			request.setAttribute("pageBean", pageBean);//�浽����
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//3 .��תҳ��
		request.getRequestDispatcher("showlistbypage.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}