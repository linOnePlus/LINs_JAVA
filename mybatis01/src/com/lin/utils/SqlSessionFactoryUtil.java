package com.lin.utils;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/*
*@author linone
*获取ssf的工具类
*/
public class SqlSessionFactoryUtil {
private static SqlSessionFactory ssf;
static {
	SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
	InputStream resourceAsStream;
	try {
		//利用ibatis 包下的resources把文件装换成流对象
		resourceAsStream = Resources.getResourceAsStream("SqlMapConfig.xml");
		ssf = ssfb.build(resourceAsStream);
	} catch (IOException e) {
		e.printStackTrace();
	}
}
//得到sqlsessionfactory
public static SqlSessionFactory getSsf() {
	return ssf;
}


}
