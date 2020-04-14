package com.lin.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lin.bean.Student;
import com.lin.service.StudentService;
import com.lin.serviceimpl.StudentServiceImpl;

/**
 * ���ڴ�������ѧ��������
 */
@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("ִ����1");
		//ֱ����post�����ύ �����������뷽ʽ
		request.setCharacterEncoding("UTF-8");
		
		//1.��ȡ�ύ���������� 
		String name = request.getParameter("sname");
		System.out.println("ִ����111");
		String gender = request.getParameter("gender");
		String phone = request.getParameter("phone");
		System.out.println("phone is "+phone);
		String birthday = request.getParameter("birthday");
		System.out.println("birthday is"+birthday);
		String info = request.getParameter("info");
		//����һ�¶��hobby��ʾ����
		String[] hobbys = request.getParameterValues("hobby");
		String hobby;
		if (hobbys==null) {
		  hobby = "��";
		}else {
			hobby = Arrays.toString(hobbys);//���������ַ���
			hobby=hobby.substring(1, hobby.length()-1);//ȥ��������
		}
		
		//2.���ݿ�����������
		//��String ���Date ���Ұ��������ݷ�װ��һ��Student����
		Date date;
		try {
			date = new SimpleDateFormat("yyyy-MM-dd").parse(birthday);
			Student s= new Student( phone, name, gender, hobby, info, date);
			StudentService  service = new StudentServiceImpl();
			service.insert(s);
		} catch (Exception e) {
			date=null;
			e.printStackTrace();
		}
		/*
		 * 3.��ת��list.jsp����(Ϊʲô����ת��֮ǰ��LISt�������������ȡ������)
		 * request.getRequestDispatcher("showlist.jsp").forward(request, response);
		 */
		request.getRequestDispatcher("StudentListServlet").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("ִ����4");
		doGet(request, response);
	}

}