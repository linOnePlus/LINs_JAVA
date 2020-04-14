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
			// �����ʺ��е����ݣ������������ݶ�����һ���ַ���,�������statement�İ�ȫ©��
			//�����ʺŵ�������1��ʼ
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
