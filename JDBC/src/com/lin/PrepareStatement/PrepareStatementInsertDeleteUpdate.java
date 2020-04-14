package com.lin.PrepareStatement;

import java.sql.Connection;
import java.sql.PreparedStatement;

import util.close;
import util.registerConn;

public class PrepareStatementInsertDeleteUpdate {

	public void insert() {
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = registerConn.getConn();
			String sql = "insert into exam(NAME,chinese) values(?,?)";
			ps = conn.prepareStatement(sql);
			ps.setString(1, "Lin");
			ps.setDouble(2, 99);
			int executeUpdate = ps.executeUpdate();
			if (executeUpdate > 0) {
				System.out.println("succeed");
			} else {
				System.out.println("fail");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close.closeConn(conn);
			close.closeStatement(ps);
		}
	}
}
