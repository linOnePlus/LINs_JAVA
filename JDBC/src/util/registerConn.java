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
			// 1创建属性配置对象
			Properties pro = new Properties();
			// 2将配置文件变成流对象（当配置文件放在SRC文件夹下时）用类加载器
			 InputStream is =
			registerConn.class.getClassLoader().getResourceAsStream("properties");
			// 将配置文件变成流对象（当配置文件放在工程目录下时）
			/* InputStream is = new FileInputStream("properties"); */
			// 3导入输入流
			pro.load(is);
			// 4读取配置文件
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
			// 1注册驱动 注册什么数据库的驱动
			Class.forName(driverClass);
			// 2获取连接对象
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;

	}
}
