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
 * 处理分页显示学生信息
 */
@WebServlet("/StudentListPageServlet")
public class StudentListPageServlet extends HttpServlet {
	
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1.获取需要显示信息的页码数
		int currentPage = Integer.parseInt(request.getParameter("currentPage"));
		
		//2.根据页码数获取需要的信息
		StudentService  service = new StudentServiceImpl();
		try {
			PageBean<Student> pageBean = service.findStudentByPage(currentPage);
			request.setAttribute("pageBean", pageBean);//存到域里
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//3 .跳转页面
		request.getRequestDispatcher("showlistbypage.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
