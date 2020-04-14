package test;

import com.lin.PrepareStatement.StatementLogin;

public class StatementLoginTest {
    @org.junit.Test
	public void logtest() {
		StatementLogin lg =new StatementLogin();
		lg.denglu("sb", "510' or '1=1");
		//statementµÄÂ©¶´ËùÔÚ
	}
}
