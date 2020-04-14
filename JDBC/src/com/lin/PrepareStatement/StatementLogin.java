package com.lin.PrepareStatement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import util.close;
import util.registerConn;
/*用statement实现的登录逻辑
 * 有不足之处，在Password处输入 or 1=1 
 * 就可以登录成功
 * 要用preparestatement改进*/

public class StatementLogin {

	public void denglu(String un, String pd) {
		Connection conn = registerConn.getConn();
		ResultSet rs = null;
		Statement st = null;
		try {
			st = conn.createStatement();
			// sql语句要是 select * from login where username='un' and password ='pd';
			String sql = "select * from login where username='" + un + "'and password='" + pd + "'";
			rs = st.executeQuery(sql);
			if (rs.next()) {
				System.out.println("登录成功");
			} else {
				System.out.println("登录失败");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close.closeAll(conn, rs, st);
		}

	}
}
