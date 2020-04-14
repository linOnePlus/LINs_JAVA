package com.lin.test;
/*
*@author linone
*/

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class JDBCTemplate {

	private ApplicationContext applicationContext = null;
	private JdbcTemplate jdbcTemplate;
	{
		applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		jdbcTemplate = (JdbcTemplate) applicationContext.getBean("jdbcTemplate");
	}

	@Test
	// 执行增删改
	public void testUpdate() {
		String sql = "update user set password = ? where username=?";
		jdbcTemplate.update(sql, "918", "lin");
	}

	// 批量更新
	@Test
	public void testManyUpdate() {
		String sql = "insert into user values(?,?,?)";
		List<Object[]> list = new ArrayList<Object[]>();
		list.add(new Object[] { "aa", 111, "aaa" });
		list.add(new Object[] { "bb", 111, "aaa" });
		list.add(new Object[] { "cc", 111, "aaa" });
		jdbcTemplate.batchUpdate(sql, list);

	}

	
	@Test
	public void testDataSource() throws SQLException {
		DataSource dataSource = (DataSource) applicationContext.getBean("dataSource");
		System.out.println(dataSource.getConnection());

	}

}
