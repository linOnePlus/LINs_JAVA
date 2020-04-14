package com.lin.dao;
/*
*@author linone
*/

import java.sql.SQLException;
import java.util.List;

import com.lin.bean.Student;

public interface StudentDao {
	
	int PAGE_SIZE=5 ;//����һ������  Ϊÿһҳ��ʾѧ���� ����
	
	/**
	  * ��ѯ����ѧ��
	 * @return List<Student>
	 * @throws SQLException 
	 */
	List<Student> finAll() throws SQLException;
	
	
	
	/**
	 * ����ҳ������ѯѧ����Ϣ
	 * @param currentPage
	 * @return ��ѯ��������ѧ�����󼯺�
	 * @throws SQLException
	 */
	List<Student> finStudentByPage(int currentPage) throws SQLException;
	
	
	/**
	 * ��ѯ�ܼ�¼��
	 * @return �ܼ�¼��
	 * @throws SQLException
	 */
	int findCount() throws SQLException; 
	
	
	/**
	 * ����ѧ��
	 * @param ��Ҫ���ӵ����ݿ��ѧ������
	 * @throws SQLException 
	 */
	void insert(Student s) throws SQLException;
	
	/**
	 * ɾ��ѧ��
	 * @param sid ɾ��ѧ����ID����
	 * @throws SQLException
	 */
	void delete(String sid ) throws SQLException;
	
	/**
	 * ����SID��ѧ������
	 * @param sid
	 * @return
	 * @throws SQLException
	 */
	Student findStudentById(int sid) throws SQLException;
	
	/**
	 * ����ѧ����Ϣ
	 * @param ��Ҫ�����µ�ѧ��
	 * @throws SQLException
	 */
	void update(Student stu) throws SQLException;
	
	/**
	 * ģ����ѯ
	 * @param sname
	 * @param sgender
	 * @return �鵽������ѧ������
	 * @throws SQLException
	 */
	List<Student> searchStudent(String sname, String sgender) throws SQLException;
}