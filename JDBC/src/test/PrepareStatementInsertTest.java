package test;

import org.junit.Test;

import com.lin.PrepareStatement.PrepareStatementInsertDeleteUpdate;

public class PrepareStatementInsertTest {

	@Test
	public void  insertTest() {
		PrepareStatementInsertDeleteUpdate p= new PrepareStatementInsertDeleteUpdate();
		p.insert();
	}
}
