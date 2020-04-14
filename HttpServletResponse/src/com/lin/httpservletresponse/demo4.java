package com.lin.httpservletresponse;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 下载操作
 * Servlet implementation class demo4
 */
@WebServlet("/demo4")
public class demo4 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 String parameter = request.getParameter("filename");
 parameter=new String( parameter.getBytes("ISO-8859-1"), "UTF-8");
System.out.println(parameter);
 //获取tomcat 里项目的路径 再传一个相对路径
 response.setHeader("Content-Disposition", "attachment;filename="+parameter);
 String realPath = getServletContext().getRealPath("downlin/"+parameter);
 InputStream is =new FileInputStream(realPath);
 OutputStream os = response.getOutputStream();
 int len=0; //JAVASE拷贝文件的格式
byte[] arr= new byte[1024];
while ((len=is.read(arr))!=-1) {
	os.write(arr, 0, len);
}
is.close();
os.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
