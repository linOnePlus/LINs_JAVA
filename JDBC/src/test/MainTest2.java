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
		int executeUpdate = st.executeUpdate("insert into exam(NAME,chinese) values('�����',99)");
	   if (executeUpdate>0) {
		System.out.println("����ɹ�");
	}else {
		System.out.println("����ʧ��");
	}
	} catch (SQLException e) {
		e.printStackTrace();
	}finally {
		close.closeAll(conn, null, null);
	}
}
}
