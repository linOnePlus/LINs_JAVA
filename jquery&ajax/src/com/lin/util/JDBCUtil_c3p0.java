package com.lin.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.mysql.jdbc.Statement;

/*
*@author linone
*/
public class JDBCUtil_c3p0 {
	static ComboPooledDataSource dataSource = null;
	static {
		dataSource = new ComboPooledDataSource();
	}

	public static Connection getConn() throws SQLException {
		return dataSource.getConnection();
	}
	
	public static ComboPooledDataSource   getDataSource() {
		return dataSource;
	}

	public static void closeAll(Statement st, ResultSet rs, Connection conn) {
		closeSt(st);
		closeConn(conn);
		closeRs(rs);
	}

	public static void closeAll(Statement st, Connection conn) {
		closeSt(st);
		closeConn(conn);

	}

	public static void closeSt(Statement st) {
		try {
			if (st != null) {
				st.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			st = null;
		}
	}

	private static void closeRs(ResultSet rs){
		try {
			if(rs != null){
				rs.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			rs = null;
		}
	}

	private static void closeConn(Connection conn) {
		try {
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			conn = null;
		}
	}
}
