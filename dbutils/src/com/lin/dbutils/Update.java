package com.lin.dbutils;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/*dbutils��ɾ��
 * ���ӳ��Ż�����
 * dbutilsֻ���Ż�CRUD*/
public class Update {
public static void main(String[] args) throws SQLException {
	
	QueryRunner queryRunner = new QueryRunner(new ComboPooledDataSource());
	queryRunner.update("insert into bank values(?,\"lee\",?)",5,200);
}
}
