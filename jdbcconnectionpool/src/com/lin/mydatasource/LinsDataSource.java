package com.lin.mydatasource;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.sql.DataSource;

import com.lin.JDBCUtil.JDBCUtil;

/*数据库连接池  负责管理连接对象的发放工作 
 * 因为数据库连接对象的创建工作  比较浪费内存 
 * 一开始创建多个连接对象  放在集合中
 * 使用完毕归还
 * */
// Datasource sun公司针对数据库连接池定义的一套规范
/*问题： 
* 	1. 需要额外记住 addBack方法
* 	2. 可能会被创建多个LinsDataSource对象
* 	3. 无法面向接口编程。 
* 	因为接口里面没有定义addBack方法。 
*   解决方法 :用一个包装类 继承LinsDataSource 并且实现Connection接口  重写Close方法 
*   方法体内调用addBack方法 
* */
public class LinsDataSource implements DataSource {
	// 一开始就创建多个连接对象放在LISt集合里面
	List<Connection> list = new ArrayList<Connection>();

	public LinsDataSource() {
		for (int i = 0; i < 10; i++) {
			Connection conn = JDBCUtil.getConn();
			list.add(conn);
		}
	}

	@Override
	public Connection getConnection() throws SQLException {
		// 判断集合里面的连接对象有没有给拿完 拿完的话再创5个
		if (list.size() == 0) {
			for (int i = 0; i < 5; i++) {
				Connection conn = JDBCUtil.getConn();
				list.add(conn);
			}
			return list.remove(0);
		} else {
			return list.remove(0);
		}
	}

	// 归还连接对象
	public void addBack(Connection conn) {
		list.add(conn);
	}

	@Override
	public PrintWriter getLogWriter() throws SQLException {
		return null;
	}

	@Override
	public void setLogWriter(PrintWriter out) throws SQLException {
	}

	@Override
	public void setLoginTimeout(int seconds) throws SQLException {
	}

	@Override
	public int getLoginTimeout() throws SQLException {
		return 0;
	}

	@Override
	public Logger getParentLogger() throws SQLFeatureNotSupportedException {
		return null;
	}

	@Override
	public <T> T unwrap(Class<T> iface) throws SQLException {
		return null;
	}

	@Override
	public boolean isWrapperFor(Class<?> iface) throws SQLException {
		return false;
	}

	@Override
	public Connection getConnection(String username, String password) throws SQLException {
		return null;
	}

}
