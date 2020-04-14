package com.lin.httpservletresponse;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ���������ļ�
 * ���� û�н��
 */
@WebServlet("/Demo5")
public class Demo5 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String filename = request.getParameter("filename");
		//����������ʾ��
		 response.setHeader("Content-Disposition", "attachment;filename="+ filename);
		//�����ļ�Ҫ�����´���
		byte[] arr= filename.getBytes("GBK");
		filename = new String(arr, "UTF-8");
		System.out.println(filename);
		String header = request.getHeader("User-Agent");
		if (header.contains("FireFox")) {
			filename=DownloadUtil.base64EncodeFileName(filename);
		} else {
     filename=URLEncoder.encode(filename, "UTF-8");
		}
		//���ز���
		 String realPath = getServletContext().getRealPath("downlin/"+filename);
		 InputStream is = new FileInputStream(realPath);
		 OutputStream os = response.getOutputStream();
		 int len = 0;
		 byte [] arr2 = new  byte[1024];
		 while ((len=is.read())!=-1) {
			os.write(arr2, 0, len);
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
