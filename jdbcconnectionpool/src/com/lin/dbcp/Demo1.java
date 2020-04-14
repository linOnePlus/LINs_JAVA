package com.lin.dbcp;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSourceFactory;
import org.junit.Test;

import com.lin.JDBCUtil.JDBCUtil;
//注意使用DBCP时候的配置文件与往常不同
public class Demo1 {
	@Test
	public void testDBCP() {
		BasicDataSourceFactory basicDataSourceFactory = new BasicDataSourceFactory();
		Properties properties = new Properties();
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			InputStream is = this.getClass().getClassLoader().getResourceAsStream("dbcp.properties");
			properties.load(is);
			DataSource createDataSource = basicDataSourceFactory.createDataSource(properties);//获取连接池对象
			conn = createDataSource.getConnection();
			String sql = "update bank set money=? where id=?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, 3000);
			ps.setInt(2, 2);
			int executeUpdate = ps.executeUpdate();
			if (executeUpdate > 0) {
				System.out.println("insert successfully");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.closePs(ps);
			JDBCUtil.closeConn(conn);
		}

	}

}
