package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * jdbc 工具类
 * 
 */
public class JdbcUtils {

    //修改此处为正确的数据库连接地址
	private static String dbUrl ="jdbc:mysql://localhost:3306/library?user=root&password=root";
//	private static String dbUrl ="jdbc:mysql://120.26.199.42:3306/library?user=root&password=root";
	
	
	/**
	 * 测试数据库是否连接成功
	 * @param args
	 * @throws SQLException
	 */
	public static void main(String[] args) throws SQLException {
	    
	    if(getConnection()!=null){
	        System.out.println("数据库连接成功。");
	    }
        
    }

	/**
	 * 获取数据库的连接
	 * 
	 * @return
	 * @throws SQLException
	 */
	public static Connection getConnection() throws SQLException {

	    String dbClassName = "com.mysql.jdbc.Driver";
	
	    Connection conn = null;
		try {
			Class.forName(dbClassName).newInstance();
			conn = DriverManager.getConnection(dbUrl);
		} catch (Exception ee) {
//			ee.printStackTrace();
		}
		if (conn == null) {
			System.err
					.println("警告: DbConnectionManager.getConnection() 获得数据库链接失败，请检查数据库连接以及账号密码是否正确.\r\n\r\n链接类型:"
							+ dbClassName + "\r\n链接位置:" + dbUrl);
		}
		return conn;
	}

	/**
	 * 释放数据库的连接
	 */

	public static void release(Connection conn, Statement st, ResultSet rs) {

		if (rs != null) {
			try {
				rs.close(); // throw new
			} catch (Exception e) {
				e.printStackTrace();
			}
			rs = null;
		}
		if (st != null) {
			try {
				st.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			st = null;
		}
		if (conn != null) {
			try {
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
}
