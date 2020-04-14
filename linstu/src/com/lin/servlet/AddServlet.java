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
 * 用于处理添加学生的请求
 */
@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("执行了1");
		//直接用post请求提交 处理中文乱码方式
		request.setCharacterEncoding("UTF-8");
		
		//1.获取提交上来的数据 
		String name = request.getParameter("sname");
		System.out.println("执行了111");
		String gender = request.getParameter("gender");
		String phone = request.getParameter("phone");
		System.out.println("phone is "+phone);
		String birthday = request.getParameter("birthday");
		System.out.println("birthday is"+birthday);
		String info = request.getParameter("info");
		//处理一下多个hobby显示问题
		String[] hobbys = request.getParameterValues("hobby");
		String hobby;
		if (hobbys==null) {
		  hobby = "无";
		}else {
			hobby = Arrays.toString(hobbys);//把数组变成字符串
			hobby=hobby.substring(1, hobby.length()-1);//去掉中括号
		}
		
		//2.数据库里添加数据
		//把String 变成Date 并且把所有数据封装成一个Student对象
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
		 * 3.跳转到list.jsp界面(为什么请求转发之前的LISt集合里面的数据取不到了)
		 * request.getRequestDispatcher("showlist.jsp").forward(request, response);
		 */
		request.getRequestDispatcher("StudentListServlet").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("执行了4");
		doGet(request, response);
	}

}
