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
	//执行单个查询 查询的数据封装成对象
	Account query = queryRunner.query("select * from  bank  where  id = ? ", new BeanHandler<Account>(Account.class), 1);
	System.out.println(query.toString());
	System.out.println("-----------------------------------------------------------------------------");
//	执行多个查询 得到一个List集合
	List<Account> query2 = queryRunner.query("select * from bank where  id =? or money=?", new  BeanListHandler<Account>(Account.class), 5,4000);
	for (Account account : query2) {
		System.out.println(account);
	}
	
	
}
}
