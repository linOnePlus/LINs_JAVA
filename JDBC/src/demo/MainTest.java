package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.hamcrest.DiagnosingMatcher;

import com.mysql.jdbc.Driver;

public class MainTest {

	public static void main(String[] args) {
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			//1ע������
			DriverManager.registerDriver(new Driver());
			//2�������� ��ȡ���Ӷ��� ��Э��+���ݿ�����
			conn = DriverManager.getConnection("jdbc:mysql://localhost/lin1", "root", "root");
			//3ͨ�����Ӷ����ȡStatement����
			st = conn.createStatement();
			//4ִ�в�ѯ executequery��ý����
			rs = st.executeQuery("select * from exam");
			//5��������� �õ�����
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("NAME");
				System.out.println("id=" + id + " " + "name=" + name);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//6�ͷ���Դ
			if (conn!=null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}finally {
					conn=null;
				}
			}
			if(st!=null) {
				try {
					st.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}finally {
					st=null;
				}
			}
			if(rs!=null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}finally {
					rs=null;
				}
			}
		}
	}

}
