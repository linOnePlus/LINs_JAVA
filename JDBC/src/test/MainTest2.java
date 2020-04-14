package test;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import util.close;
import util.registerConn;

public class MainTest2 {
@org.junit.Test
public void test(){
	Connection conn = registerConn.getConn();
	try {
		Statement st = conn.createStatement();
		int executeUpdate = st.executeUpdate("insert into exam(NAME,chinese) values('林泽佳',99)");
	   if (executeUpdate>0) {
		System.out.println("插入成功");
	}else {
		System.out.println("插入失败");
	}
	} catch (SQLException e) {
		e.printStackTrace();
	}finally {
		close.closeAll(conn, null, null);
	}
}
}
