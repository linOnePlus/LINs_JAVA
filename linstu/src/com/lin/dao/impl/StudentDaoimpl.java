package com.lin.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.lin.bean.Student;
import com.lin.dao.StudentDao;
import com.lin.util.JDBCUtil_c3p0;
import com.lin.util.isempty;

/*
 * StudentDao的具体实现类 针对前面定义的规范 做出具体的实现
*@author linone
*/
public class StudentDaoimpl implements StudentDao {

	/**
	 * 查询所有学生 返回一个List集合
	 * 
	 * @throws SQLException
	 */
	@Override
	public List<Student> finAll() throws SQLException {
		QueryRunner queryRunner = new QueryRunner(JDBCUtil_c3p0.getDataSource());
		List<Student> query = queryRunner.query("select * from stu", new BeanListHandler<Student>(Student.class));
		return query;
	}

	@Override
	public void insert(Student stu) throws SQLException {
		QueryRunner queryRunner = new QueryRunner(JDBCUtil_c3p0.getDataSource());
		//这里的顺序要和数据库的列名对应 ，因为你使用了简写
		queryRunner.update("insert into stu values(null,?,?,?,?,?,?)", stu.getPhone(),stu.getSname(),
				stu.getGender(),stu.getHobby(),stu.getInfo(),stu.getBirthday());
	}

	@Override
	public void delete(String sid) throws SQLException {
		QueryRunner queryRunner = new QueryRunner(JDBCUtil_c3p0.getDataSource());
		queryRunner.update("delete from stu where sid =?", sid);

	}

	@Override
	public Student findStudentById(int sid) throws SQLException {
		QueryRunner queryRunner = new QueryRunner(JDBCUtil_c3p0.getDataSource());
		Student stu = queryRunner.query("select * from stu where sid=?", new BeanHandler<Student>(Student.class), sid);
		return stu;
	}

	@Override
	public void update(Student stu) throws SQLException {
		QueryRunner queryRunner = new QueryRunner(JDBCUtil_c3p0.getDataSource());
		queryRunner.update("update stu set sname=?,gender=?,phone=?,birthday=? ,hobby=? ,info=? where sid= ? ",
				stu.getSname(), stu.getGender(), stu.getPhone(), stu.getBirthday(), stu.getHobby(), stu.getInfo(),
				stu.getSid());
	}

	@Override
	public List<Student> searchStudent(String sname, String sgender) throws SQLException {
		QueryRunner queryRunner = new QueryRunner(JDBCUtil_c3p0.getDataSource());
		/*
		 * 这里要分析一下： 如果只有姓名 ，select * from stu where sname like ? ; 如果只有性别 ， select *
		 * from stu where gender = ?
		 * 
		 * 如果两个都有 select * from stu where sname like ? and gender=?
		 * 
		 * 如果两个都没有就查询所有。(默认) select * from stu where 1= 1;
		 */
		String sql = "select * from stu where 1=1 ";
		List<String> list = new ArrayList<String>();// 用来放可变参数   太巧妙了当时还不懂Mybatis只能这样写了。

		if (!isempty.isEmpty(sname)) {
			sql = sql + "and sname like ?";
			list.add("%" + sname + "%");
		} 
		if (!isempty.isEmpty(sgender)) {
			sql = sql + "and gender = ?";
			list.add(sgender);
		}

		 return queryRunner.query(sql, new  BeanListHandler<Student>(Student.class), list.toArray());
	}

	@Override
	public List<Student> finStudentByPage(int currentPage) throws SQLException {
		QueryRunner queryRunner = new QueryRunner(JDBCUtil_c3p0.getDataSource());
		//第一个问号，代表一页返回多少条记录  ， 第二个问号， 跳过前面的多少条记录(从哪个索引开始)。
		//limit x,y  x代表起始索引，y代表显示个数。记这个比较好
				//5 0 --- 第一页 (1-1)*5
				//5 5  --- 第二页 (2-1)*5
				//5 10  --- 第三页
	   return queryRunner.query("select * from stu limit ? offset ?", new BeanListHandler<Student>(Student.class),
			  PAGE_SIZE,(currentPage-1)*PAGE_SIZE);
	}

	@Override
	public int findCount() throws SQLException {
		QueryRunner queryRunner = new QueryRunner(JDBCUtil_c3p0.getDataSource());
		Long a  = (Long) queryRunner.query("select count(*) from  stu", new ScalarHandler());
		return a.intValue();
	}

}
