package util;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class registerConn {
	static String driverClass = null;
	static String url = null;
	static String user = null;
	static String password = null;
	static {
		try {
			// 1�����������ö���
			Properties pro = new Properties();
			// 2�������ļ���������󣨵������ļ�����SRC�ļ�����ʱ�����������
			 InputStream is =
			registerConn.class.getClassLoader().getResourceAsStream("properties");
			// �������ļ���������󣨵������ļ����ڹ���Ŀ¼��ʱ��
			/* InputStream is = new FileInputStream("properties"); */
			// 3����������
			pro.load(is);
			// 4��ȡ�����ļ�
			driverClass = pro.getProperty("driverClass");
			url = pro.getProperty("url");
			user = pro.getProperty("user");
			password = pro.getProperty("password");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static Connection getConn() {
		Connection conn = null;
		try {
			// 1ע������ ע��ʲô���ݿ������
			Class.forName(driverClass);
			// 2��ȡ���Ӷ���
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;

	}
}
