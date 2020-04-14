package com.lin.dao;
/*
*@author linone
*/

import java.sql.SQLException;
import java.util.List;

import com.lin.bean.Student;

public interface StudentDao {
	
	int PAGE_SIZE=5 ;//定义一个常量  为每一页显示学生的 数量
	
	/**
	  * 查询所有学生
	 * @return List<Student>
	 * @throws SQLException 
	 */
	List<Student> finAll() throws SQLException;
	
	
	
	/**
	 * 根据页码数查询学生信息
	 * @param currentPage
	 * @return 查询到的所有学生对象集合
	 * @throws SQLException
	 */
	List<Student> finStudentByPage(int currentPage) throws SQLException;
	
	
	/**
	 * 查询总记录数
	 * @return 总记录数
	 * @throws SQLException
	 */
	int findCount() throws SQLException; 
	
	
	/**
	 * 添加学生
	 * @param 需要添加到数据库的学生对象
	 * @throws SQLException 
	 */
	void insert(Student s) throws SQLException;
	
	/**
	 * 删除学生
	 * @param sid 删除学生的ID号码
	 * @throws SQLException
	 */
	void delete(String sid ) throws SQLException;
	
	/**
	 * 根据SID找学生对象
	 * @param sid
	 * @return
	 * @throws SQLException
	 */
	Student findStudentById(int sid) throws SQLException;
	
	/**
	 * 更新学生信息
	 * @param 需要被更新的学生
	 * @throws SQLException
	 */
	void update(Student stu) throws SQLException;
	
	/**
	 * 模糊查询
	 * @param sname
	 * @param sgender
	 * @return 查到的所有学生对象
	 * @throws SQLException
	 */
	List<Student> searchStudent(String sname, String sgender) throws SQLException;
}
