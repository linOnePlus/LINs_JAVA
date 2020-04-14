package util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class close {
	public static void closeAll(Connection conn, ResultSet rs, Statement st) {
		closeConn(conn);
		closeStatement(st);
		closeResultSet(rs);
	}


	public static void closeConn(Connection conn) {
		try {
			if (conn != null)
				conn.close();
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			conn = null;
		}
	}

	public static void closeStatement(Statement st) {
		try {
			if (st != null)
				st.close();
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			st = null;
		}
	}

	public static void closeResultSet(ResultSet rs) {
		try {
			if (rs != null)
				rs.close();
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			rs = null;
		}
	}

}
