package demo;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import util.close;
import util.registerConn;

public class MainTest2 {

	public static void main(String[] args) {
		Connection conn =null;
try {
	 conn = registerConn.getConn();
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
