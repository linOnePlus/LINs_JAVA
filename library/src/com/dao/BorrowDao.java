package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.model.Borrow;
import com.util.JdbcUtils;

public class BorrowDao {

	 

	public boolean add(String readerId,String bookId) {

		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;

		try {
			conn = JdbcUtils.getConnection();
			String sql = "insert into borrow(book_id,reader_id) values (?,?)";
			st = conn.prepareStatement(sql);
			st.setString(1, bookId);
			st.setString(2, readerId);
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
	 

	public boolean deleteById(String borrowId) {

		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;

		try {
			conn = JdbcUtils.getConnection();
			String sql = "delete from borrow where id=? ";
			st = conn.prepareStatement(sql);
			st.setString(1, borrowId);
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
	
	
	public List<Borrow> getList(String readerId) {
        Connection conn = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        List<Borrow> list = new ArrayList<Borrow>();
        try {
            conn = JdbcUtils.getConnection();
            String sql = "select * from borrow bo,book b,reader r where b.id=bo.book_id and r.id=bo.reader_id and bo.reader_id=?  order by  bo.id asc";
            st = conn.prepareStatement(sql);
            st.setString(1, readerId);
            rs = st.executeQuery();
            while (rs.next()) {
                Borrow borrow = new Borrow();

                
                borrow.setId(rs.getString("ID"));
                borrow.setAuthor(rs.getString("AUTHOR"));
                borrow.setCode(rs.getString("CODE"));
                borrow.setName(rs.getString("NAME"));
                borrow.setPage(rs.getString("PAGE"));
                borrow.setPress(rs.getString("PRESS"));
                borrow.setPrice(rs.getString("PRICE"));
                borrow.setType(rs.getString("TYPE"));
                borrow.setBookId(rs.getString("book_id"));
                borrow.setReaderId(rs.getString("reader_id"));
                borrow.setTime(rs.getString("time"));
                
                list.add(borrow);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JdbcUtils.release(conn, st, rs);
        }

        return list;
    }

	public List<Borrow> getAll() {
	    Connection conn = null;
	    PreparedStatement st = null;
	    ResultSet rs = null;
	    List<Borrow> list = new ArrayList<Borrow>();
	    try {
	        conn = JdbcUtils.getConnection();
	        String sql = "select bo.*,b.*,r.name as name1,r.num from borrow bo,book b,reader r where b.id=bo.book_id and r.id=bo.reader_id  order by  bo.id asc";
	        st = conn.prepareStatement(sql);
	        rs = st.executeQuery();
	        while (rs.next()) {
	            Borrow borrow = new Borrow();
	            
	            
	            borrow.setId(rs.getString("ID"));
	            borrow.setAuthor(rs.getString("AUTHOR"));
	            borrow.setCode(rs.getString("CODE"));
	            borrow.setName(rs.getString("NAME"));
	            borrow.setPage(rs.getString("PAGE"));
	            borrow.setPress(rs.getString("PRESS"));
	            borrow.setPrice(rs.getString("PRICE"));
	            borrow.setType(rs.getString("TYPE"));
	            borrow.setBookId(rs.getString("book_id"));
	            borrow.setReaderId(rs.getString("reader_id"));
	            borrow.setTime(rs.getString("time"));
	            borrow.setReaderName(rs.getString("name1"));
	            borrow.setNum(rs.getString("num"));
	            
	            list.add(borrow);
	        }
	        
	    } catch (Exception e) {
	        e.printStackTrace();
	    } finally {
	        JdbcUtils.release(conn, st, rs);
	    }
	    
	    return list;
	}

}
