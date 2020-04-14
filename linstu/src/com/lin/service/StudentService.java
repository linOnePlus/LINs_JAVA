package com.lin.service;

import java.sql.SQLException;
import java.util.List;

import com.lin.bean.PageBean;
import com.lin.bean.Student;

/*
 * ѧ��Service�� ѧ��ҵ��淶(��ҳ�������Dao�߼�)
*@author linone
*/
public interface StudentService {

	
	/**
	 * ��ѯ��ҳ������
	 * @param currentPage
	 * @return
	 * @throws SQLException
	 */
	PageBean<Student> findStudentByPage(int currentPage) throws SQLException ;
	
	List<Student> finAll() throws SQLException;
	
	void insert(Student s) throws SQLException;
	
	void delete(String sid ) throws SQLException;
	
	Student findStudentById(int sid) throws SQLException;
	
	void update(Student stu) throws SQLException;
	
	List<Student> searchStudent(String sname, String sgender) throws SQLException;
}