package com.lin.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lin.bean.Student;
import com.lin.service.StudentService;
import com.lin.serviceimpl.StudentServiceImpl;

/**
 * ����Sid��ѯ����ѧ������Ϣ  
 * ������Ϣ��������������Ϣ��JSpҳ��
 */
@WebServlet("/EditServlet")
public class EditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		try {
			//����id
			int sid = Integer.parseInt(request.getParameter("sid"));
			//��ѯ
			StudentService  service = new StudentServiceImpl();
			Student stu = service.findStudentById(sid);
			//������
			request.setAttribute("stu", stu);
			//��ת��JSp
			request.getRequestDispatcher("edit.jsp").forward(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
