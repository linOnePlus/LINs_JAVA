package com.lin.c3p0;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class Demo1 {
	@Test
	public void testC3p0() {
		ComboPooledDataSource dataSource = new ComboPooledDataSource();// 一步到位 直接自动关联Xml文件
		try {
			Connection conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement("select * from bank where money>?");
			ps.setInt(1, 200);
			ResultSet rs = ps.executeQuery();
    while (rs.next()) {
		String name = rs.getString("name");
		System.out.println(name);
	}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
