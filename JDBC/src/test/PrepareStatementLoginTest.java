package test;

import org.junit.Test;

import com.lin.PrepareStatement.PrepareStatementLogin;

public class PrepareStatementLoginTest {
	@Test
public void loginTest() {
	PrepareStatementLogin psl=new  PrepareStatementLogin();
	psl.login("sb", "510' or '1=1");
	//Ԥ����sql��䣬�����Statement��ȫ����
}
}
