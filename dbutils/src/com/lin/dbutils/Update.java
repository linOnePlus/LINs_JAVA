package com.lin.dbutils;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/*dbutils增删改
 * 连接池优化连接
 * dbutils只能优化CRUD*/
public class Update {
public static void main(String[] args) throws SQLException {
	
	QueryRunner queryRunner = new QueryRunner(new ComboPooledDataSource());
	queryRunner.update("insert into bank values(?,\"lee\",?)",5,200);
}
}
