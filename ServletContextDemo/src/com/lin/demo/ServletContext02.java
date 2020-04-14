package com.lin.demo;
/*servletContext��ȡweb�����������Դ�ļ� ���ַ���
 * classloader��ȡ��Դ�ļ���һ�ַ���
 * config.propertiesλ��D:\apache-tomcat-8.5.42\wtpwebapps\ServletContextDemo\WEB-INF\classes
 * */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletContext02
 */
@WebServlet("/ServletContext02")
public class ServletContext02 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		getRealPath();
		fileInputstream();
		getresourseAsstream();
		classloader();

	}

	private void classloader() throws IOException {
		Properties properties = new Properties();
		InputStream is = null;
		is = this.getClass().getClassLoader().getResourceAsStream("config.properties");
		properties.load(is);
		String property = properties.getProperty("name");
		System.out.println(property);
	}

	private void getresourseAsstream() throws IOException {
		Properties properties = new Properties();
		ServletContext servletContext = getServletContext();
		// ��Թ���Ŀ¼�����·��
		InputStream is = servletContext.getResourceAsStream("/WEB-INF/classes/config.properties");

		properties.load(is);
		String property = properties.getProperty("name");
		System.out.println(property);
	}

	private void fileInputstream() throws FileNotFoundException, IOException {
		Properties properties = new Properties();
		InputStream is = new FileInputStream(
				"D:\\apache-tomcat-8.5.42\\wtpwebapps\\ServletContextDemo\\WEB-INF\\classes\\config.properties");
		properties.load(is);
		String property = properties.getProperty("name");
		System.out.println(property);
	}

	private void getRealPath() throws FileNotFoundException, IOException {
		Properties properties = new Properties();
		ServletContext servletContext = getServletContext();
		// ��Թ���Ŀ¼�����·��
		String realPath = servletContext.getRealPath("/WEB-INF/classes/config.properties");
		InputStream is = new FileInputStream(realPath);
		properties.load(is);
		String property = properties.getProperty("name");
		System.out.println(property);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
