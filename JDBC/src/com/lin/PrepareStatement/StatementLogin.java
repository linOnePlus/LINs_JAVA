package com.lin.PrepareStatement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import util.close;
import util.registerConn;
/*��statementʵ�ֵĵ�¼�߼�
 * �в���֮������Password������ or 1=1 
 * �Ϳ��Ե�¼�ɹ�
 * Ҫ��preparestatement�Ľ�*/

public class StatementLogin {

	public void denglu(String un, String pd) {
		Connection conn = registerConn.getConn();
		ResultSet rs = null;
		Statement st = null;
		try {
			st = conn.createStatement();
			// sql���Ҫ�� select * from login where username='un' and password ='pd';
			String sql = "select * from login where username='" + un + "'and password='" + pd + "'";
			rs = st.executeQuery(sql);
			if (rs.next()) {
				System.out.println("��¼�ɹ�");
			} else {
				System.out.println("��¼ʧ��");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close.closeAll(conn, rs, st);
		}

	}
}
