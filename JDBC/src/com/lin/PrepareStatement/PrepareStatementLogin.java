package com.lin.PrepareStatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import util.close;
import util.registerConn;

public class PrepareStatementLogin {
	public void login(String username, String password) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = registerConn.getConn();
			String sql = "select * from login where username = ? and password =?";
			ps = conn.prepareStatement(sql);
			// 插入问号中的数据，后面插入的内容都看成一个字符串,不会出现statement的安全漏洞
			//插入问号的索引从1开始
			ps.setString(1, username);
			ps.setString(2, password);
			rs = ps.executeQuery();
			if (rs.next()) {
				System.out.println("success");
			} else {
				System.out.println("fail");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close.closeAll(conn, rs, ps);
		}
	}
}
