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

/*���ݿ����ӳ�  ����������Ӷ���ķ��Ź��� 
 * ��Ϊ���ݿ����Ӷ���Ĵ�������  �Ƚ��˷��ڴ� 
 * һ��ʼ����������Ӷ���  ���ڼ�����
 * ʹ����Ϲ黹
 * */
// Datasource sun��˾������ݿ����ӳض����һ�׹淶
/*���⣺ 
* 	1. ��Ҫ�����ס addBack����
* 	2. ���ܻᱻ�������LinsDataSource����
* 	3. �޷�����ӿڱ�̡� 
* 	��Ϊ�ӿ�����û�ж���addBack������ 
*   ������� :��һ����װ�� �̳�LinsDataSource ����ʵ��Connection�ӿ�  ��дClose���� 
*   �������ڵ���addBack���� 
* */
public class LinsDataSource implements DataSource {
	// һ��ʼ�ʹ���������Ӷ������LISt��������
	List<Connection> list = new ArrayList<Connection>();

	public LinsDataSource() {
		for (int i = 0; i < 10; i++) {
			Connection conn = JDBCUtil.getConn();
			list.add(conn);
		}
	}

	@Override
	public Connection getConnection() throws SQLException {
		// �жϼ�����������Ӷ�����û�и����� ����Ļ��ٴ�5��
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

	// �黹���Ӷ���
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
