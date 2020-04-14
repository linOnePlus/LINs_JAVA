package cn.campus.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import cn.campus.Bean.Userbean;
import cn.campus.dao.Userdao;
import cn.campus.util.jdbcutil;

/**
 * 用户登录注册功能的dao
 * 
 * @author 10263
 *
 */
public class Userdaoimpl implements Userdao {

	@Test
	public boolean login(String usname, String pwd) {
		Connection conn = null;
		PreparedStatement pt = null;
		ResultSet rs = null;

		try {
			conn = jdbcutil.getconn();
			String sql = "select * from user where username=? and password=?";
			pt = conn.prepareStatement(sql);
			pt.setString(1, usname);
			pt.setString(2, pwd);

			rs = pt.executeQuery();

			return rs.next();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			jdbcutil.Release(pt, rs, conn);
		}
		return false;
	}
	/**
	 * 注册功能的操作数据库
	 */

	@Test
	public int regist(Userbean user) {

		Connection conn = null;
		PreparedStatement pt = null;
		
		int update = 0;
		try {
			conn = jdbcutil.getconn();
			String sql = "insert into user(username,password,repassword,number,email) values (?,?,?,?,?)";
			//编写用户的基本信息
			String[] info = { user.getUsname(), user.getPwd(), user.getRpwd(), user.getNumber(), user.getEmail() };
			pt = conn.prepareStatement(sql);
			// 处理占位符的问题
			if (info != null) {
				for (int i = 0; i < info.length; i++) {
					pt.setString(1 + i, info[i]);
				}
			}
			update = pt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			jdbcutil.Release(pt, conn);
		}

		
		return update;
	}
	@Override
	public Userbean findByUser(String usname) {
		Connection conn = null;
		PreparedStatement pt = null;
		ResultSet rs = null;
		

		try {
			conn = jdbcutil.getconn();
			String sql = "select * from user where username=?";
			pt = conn.prepareStatement(sql);
			String info[] = {usname};
			Userbean user = new Userbean();
			pt.setString(1, info[0]);

			rs = pt.executeQuery();
			
			while(rs.next()) {
				user.setUsname(rs.getString("username"));
				return user;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			jdbcutil.Release(pt, rs, conn);
		}
		return null;
		
	}

}
