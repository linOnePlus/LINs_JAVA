package cn.campus.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class jdbcutil {
	
	private static String url = null;
	private static String user = null;
	private static String password = null;
	private static String driverclass = null;
	
	static Connection conn = null;

	
	//获取properties配置文件
	static {
		//创建一个配置对象
		Properties properties = new Properties();
		
		//配置文件在src下
		InputStream is = jdbcutil.class.getClassLoader().getResourceAsStream("Properties");
		
		//导入输出流
		try {
			properties.load(is);
			
			//读取信息
			driverclass  = properties.getProperty("driverclass");
			url = properties.getProperty("url");
			
			user = properties.getProperty("user");
			
			password = properties.getProperty("password");
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static Connection getconn() {
		//注册驱动
		try {
			Class.forName(driverclass);
			//建立连接
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
		
	}
	
	public static void Release(Statement st, ResultSet rs, Connection conn) {
		CloseRs(rs);
		CloseSt(st);
		CloseConn(conn);
		
	}
	public static void Release(Statement st, Connection conn) {
		CloseSt(st);
		CloseConn(conn);
		
	}
	public static void Release(PreparedStatement pt, Connection conn) {
		ClosePt(pt);
		CloseConn(conn);
		
	}
	public static void Release(PreparedStatement pt, ResultSet rs, Connection conn) {
		
		CloseRs(rs);
		ClosePt(pt);
		CloseConn(conn);
		
	}
	
	private static void CloseRs(ResultSet rs) {
		try {
			if(rs != null) {
				rs.close();
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	private static void CloseSt(Statement st) {
		try {
			if(st != null) {
				st.close();
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private static void CloseConn(Connection conn) {
		try {
			if(conn != null) {
				conn.close();
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private static void ClosePt(PreparedStatement pt) {
		try {
			if(pt != null) {
				pt.close();
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
