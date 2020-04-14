package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.model.Reader;
import com.util.JdbcUtils;

public class ReaderDao {

	public Reader getByUsername(String username) {
		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		Reader user = null;
		try {
			conn = JdbcUtils.getConnection();
			String sql = "select * from reader where username=?";
			st = conn.prepareStatement(sql);
			st.setString(1, username);
			rs = st.executeQuery();
			if (rs.next()) {
				user = new Reader();
				String id = rs.getString("ID");
				String password = rs.getString("PASSWORD");
				String num = rs.getString("num");
				user.setId(id);
				user.setUsername(username);
				user.setNum(num);
				user.setPassword(password);
				
				user.setName(rs.getString("name"));
			}

		} catch (Exception e) {
//			e.printStackTrace();

		} finally {
			JdbcUtils.release(conn, st, rs);
		}

		return user;
	}

	public Reader getById(String id) {
		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		Reader user = null;
		try {
			conn = JdbcUtils.getConnection();
			String sql = "select * from reader where ID=?";
			st = conn.prepareStatement(sql);
			st.setString(1, id);
			rs = st.executeQuery();
			if (rs.next()) {
				user = new Reader();
				String username = rs.getString("username");
				String password = rs.getString("PASSWORD");
				String num = rs.getString("num");
				user.setId(id);
				user.setUsername(username);
				user.setNum(num);
				user.setPassword(password);
				user.setName(rs.getString("name"));
			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			JdbcUtils.release(conn, st, rs);
		}

		return user;
	}

	public boolean add(Reader user) {

		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;

		try {
			conn = JdbcUtils.getConnection();
			String sql = "insert into reader(password,username,num,name) values (?,?,?,?)";
			st = conn.prepareStatement(sql);
			st.setString(1, user.getPassword());
			st.setString(2, user.getUsername());
			st.setString(3, user.getNum());
			st.setString(4, user.getName());
			int num = st.executeUpdate();
			if (num>= 1) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			JdbcUtils.release(conn, st, rs);
		}

		return false;
	}

	public boolean update(String password, String id) {

		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;

		try {
			conn = JdbcUtils.getConnection();
			String sql = "update reader set PASSWORD=? where ID=?";
			st = conn.prepareStatement(sql);
			st.setString(1, password);
			st.setString(2, id);
			int num = st.executeUpdate();
			if (num < 1) {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			JdbcUtils.release(conn, st, rs);
		}

		return true;
	}
	
	public boolean update2(Reader user) {

		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;

		try {
			conn = JdbcUtils.getConnection();
			String sql = "update reader set password=?,name=?,num=? where id=?";
			st = conn.prepareStatement(sql);
			st.setString(1, user.getPassword());
			st.setString(2, user.getName());
			st.setString(3, user.getNum());
			st.setString(4, user.getId());
			int num = st.executeUpdate();
			if (num < 1) {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			JdbcUtils.release(conn, st, rs);
		}

		return true;
	}

	public boolean deleteById(String id) {

		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;

		try {
			conn = JdbcUtils.getConnection();
			String sql = "delete from reader where ID=?";
			st = conn.prepareStatement(sql);
			st.setString(1, id);
			int num = st.executeUpdate();
			if (num < 1) {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			JdbcUtils.release(conn, st, rs);
		}

		return true;
	}

	public List<Reader> getList() {
		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		List<Reader> list = new ArrayList<Reader>();
		try {
			conn = JdbcUtils.getConnection();
			String sql = "select * from reader  order by ID asc";
			st = conn.prepareStatement(sql);
			rs = st.executeQuery();
			while (rs.next()) {
				Reader user = new Reader();

				user.setId(rs.getString("ID"));
				user.setUsername(rs.getString("username"));
				user.setPassword(rs.getString("password"));
				user.setNum(rs.getString("num"));
				user.setName(rs.getString("name"));

				list.add(user);
			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			JdbcUtils.release(conn, st, rs);
		}

		return list;
	}
	
	public static void main(String[] args) {
	}

}
