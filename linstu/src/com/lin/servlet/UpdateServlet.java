package com.lin.servlet;

import java.io.IOException;
import java.sql.SQLException;
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
 * 更新数据到数据库 并且跳转到showlist界面
 */
@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {


	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		//1,获取数据
		int sid =Integer.parseInt(request.getParameter("sid"));
		String sname = request.getParameter("sname");
		String gender = request.getParameter("gender");
		String phone = request.getParameter("phone");
		String birthday = request.getParameter("birthday");
		String info = request.getParameter("info");
		//处理一下多个hobby显示问题
		String[] hobbys = request.getParameterValues("hobby");
		String hobby = Arrays.toString(hobbys);//把数组变成字符串
		hobby=hobby.substring(1, hobby.length()-1);//去掉中括号
		//将String birthday变成Date类型
		Date date = null ;
		try {
			date = new SimpleDateFormat("yyyy-MM-dd").parse(birthday);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		//2添加更新信息到数据库
		Student stu= new Student(sid, phone, sname, gender, hobby, info, date);
		StudentService service = new  StudentServiceImpl();
		try {
			service.update(stu);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//3跳转到showlist.jsp界面
		request.getRequestDispatcher("StudentListServlet").forward(request, response);
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
