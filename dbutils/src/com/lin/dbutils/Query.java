package com.lin.dbutils;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class Query {
public static void main(String[] args) throws SQLException {
	QueryRunner queryRunner = new  QueryRunner(new ComboPooledDataSource());
	//ִ�е�����ѯ ��ѯ�����ݷ�װ�ɶ���
	Account query = queryRunner.query("select * from  bank  where  id = ? ", new BeanHandler<Account>(Account.class), 1);
	System.out.println(query.toString());
	System.out.println("-----------------------------------------------------------------------------");
//	ִ�ж����ѯ �õ�һ��List����
	List<Account> query2 = queryRunner.query("select * from bank where  id =? or money=?", new  BeanListHandler<Account>(Account.class), 5,4000);
	for (Account account : query2) {
		System.out.println(account);
	}
	
	
}
}
