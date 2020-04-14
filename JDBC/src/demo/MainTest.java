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
			//1注册驱动
			DriverManager.registerDriver(new Driver());
			//2建立连接 获取连接对象 传协议+数据库名字
			conn = DriverManager.getConnection("jdbc:mysql://localhost/lin1", "root", "root");
			//3通过连接对象获取Statement对象
			st = conn.createStatement();
			//4执行查询 executequery获得结果集
			rs = st.executeQuery("select * from exam");
			//5遍历结果集 得到数据
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("NAME");
				System.out.println("id=" + id + " " + "name=" + name);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//6释放资源
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
