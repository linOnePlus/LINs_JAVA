package com.lin.JDBCUtil;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCUtil {
	static String driverClass = null;
	static String user = null;
	static String password = null;
	static String url = null;

	static {
		Properties properties = new Properties();
		try {
			properties.load(new FileInputStream("jdbc.properties"));
			driverClass = properties.getProperty("driverClass");
			url = properties.getProperty("url");
			password = properties.getProperty("password");
			user = properties.getProperty("user");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public  static Connection getConn() {
		try {
			Class.forName(driverClass);
			Connection conn = DriverManager.getConnection(url, user, password);
			return conn;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}
	
	
	public  static void closeAll(ResultSet rs ,Connection conn,PreparedStatement ps) {
		closeConn(conn);
		closePs(ps);
		closeRs(rs);
	}

	public static void closeRs(ResultSet rs) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} // 我自己写的关流逻辑
		}
	}

	public static void closePs(PreparedStatement ps) {
		try {
			if (ps != null) {
				ps.close();
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			ps = null;
		}
//标准关流逻辑
	}

	public static void closeConn(Connection conn) {
		try {
			if (conn != null) {
				conn.close();
			}

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			conn = null;
		}
	}
}
