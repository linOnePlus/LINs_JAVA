package com.lin.serviceimpl;

import java.sql.SQLException;
import java.util.List;

import com.lin.bean.PageBean;
import com.lin.bean.Student;
import com.lin.dao.StudentDao;
import com.lin.dao.impl.StudentDaoimpl;
import com.lin.service.StudentService;

/*
 * ѧ��ҵ���ʵ����
*@author linone
*/
public class StudentServiceImpl implements StudentService{

	/**
	 * ���ܽ���daoʵ�� ��һ�߼�����ѯ��
	 */
	@Override
	public List<Student> finAll() throws SQLException {
		StudentDao dao = new StudentDaoimpl();
		return dao.finAll();
	}

	@Override
	public void insert(Student s) throws SQLException {
		StudentDao dao = new StudentDaoimpl();
		dao.insert(s);
	}

	@Override
	public void delete(String sid) throws SQLException {
		StudentDao dao = new  StudentDaoimpl();
		dao.delete(sid);
	}

	@Override
	public Student findStudentById(int sid) throws SQLException {
		StudentDao dao = new  StudentDaoimpl();
		return dao.findStudentById(sid);
	}

	@Override
	public void update(Student stu) throws SQLException {
		StudentDao dao = new StudentDaoimpl();
		dao.update(stu);
	}

	@Override
	public List<Student> searchStudent(String sname, String sgender) throws SQLException {
		StudentDao  dao = new StudentDaoimpl();
		return dao.searchStudent(sname, sgender);
	}

	@Override
	public PageBean<Student> findStudentByPage(int currentPage) throws SQLException {
		
		//��Ҫ��ʾ��ҳ���ϵķ�ҳ����������װ
		PageBean<Student> pageBean = new PageBean<Student>();
		pageBean.setCurrentPage(currentPage);//���õ�ǰҳ
		pageBean.setPageSize(StudentDao.PAGE_SIZE);//����ÿҳ�ļ�¼��
		StudentDao dao =new StudentDaoimpl();
		List<Student> finStudentByPage = dao.finStudentByPage(currentPage);
		pageBean.setList(finStudentByPage);//���ø�ҳ��ʾ��ѧ������
		int totalCount = dao.findCount();
		pageBean.setTotalSize(totalCount);//�����ܼ�¼��
		//������ ��ֱ������ �������� ��Ҫ+1
		int pagecount = totalCount % StudentDao.PAGE_SIZE == 0? totalCount / StudentDao.PAGE_SIZE:(totalCount / StudentDao.PAGE_SIZE)+1;
		pageBean.setTotalPage(pagecount);//������ҳ��

				
		return pageBean;
	}



}
