package cn.campus.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.campus.Bean.Userbean;
import cn.campus.dao.Userdao;
import cn.campus.dao.impl.Userdaoimpl;

/**
 * 处理registAjax的Servlet Servlet implementation class ServletAjaxServlet
 */
@WebServlet("/ServletAjaxServlet")
public class ServletAjaxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 处理中文乱码
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");

		String usname = request.getParameter("username");
		System.out.println("ajax-->" + usname);
		
		Userbean user = new Userbean();
		
		Userdao a = new Userdaoimpl();
		Userbean findByUser = a.findByUser(usname);
		
		PrintWriter pw = response.getWriter();
		System.out.println("ajax--->"+findByUser);
		if(findByUser==null) {
			pw.write("false");
		}else {
			pw.write("true");
		}

		doGet(request, response);
	}

}
