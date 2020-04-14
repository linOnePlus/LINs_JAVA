package com.lin.session;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Demo1
 */
@WebServlet("/Demo1")
public class Demo1 extends HttpServlet {
	
	@SuppressWarnings("deprecation")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 HttpSession session = request.getSession();//get session
 String id = session.getId();//get session id
 session.setAttribute("lin", 23);//setattribute
 Object attribute = session.getAttribute("lin");//get attribute
 session.setAttribute("lee", 24);
 Object attribute2 = session.getAttribute("lee");
 System.out.println(id+"   "+attribute+""+attribute2);
 session.removeAttribute("lee");//removed attribute
 Object attribute3 = session.getAttribute("lee");
 System.out.println(id+"   "+attribute+""+attribute3);
 
 Enumeration<String> attributeNames = session.getAttributeNames();//遍历session中的值
while (attributeNames.hasMoreElements()) {
	String string = (String) attributeNames.nextElement();//获取键
	Object attribute4 = session.getAttribute(string);
	System.out.println(attribute4);
}
String[] valueNames = session.getValueNames();
for (String string : valueNames) {//获取键
	System.out.print(string);
}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
