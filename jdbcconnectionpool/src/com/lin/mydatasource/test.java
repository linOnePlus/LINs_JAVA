package com.lin.mydatasource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;

public class test {

	@Test
	public  void testPool(){
		Connection conn = null;
	LinsDataSource dataSource = new LinsDataSource();
	try {
		conn = dataSource.getConnection();
		String sql= "select * from bank where id = ? ";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, 1);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			int id = rs.getInt("id");
			int money = rs.getInt("money");
			String name = rs.getString("name");
			System.out.println(id+" "+ money+" "+name);
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}finally {
		dataSource.addBack(conn);
		
	}
		
		
		
	}
}
