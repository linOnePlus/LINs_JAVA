package com.lin.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lin.service.StudentService;
import com.lin.serviceimpl.StudentServiceImpl;

/**
 * 处理删除操作
 */
@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//1.获取ID号 执行删除操作
	String sid = request.getParameter("sid");
	System.out.println(sid);
	StudentService service = new StudentServiceImpl();
	try {
		service.delete(sid);
	} catch (SQLException e) {
		e.printStackTrace();
	}
	//2.删除完跳转到servlet
	request.getRequestDispatcher("StudentListServlet").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
