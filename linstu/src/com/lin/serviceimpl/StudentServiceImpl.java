package com.lin.serviceimpl;

import java.sql.SQLException;
import java.util.List;

import com.lin.bean.PageBean;
import com.lin.bean.Student;
import com.lin.dao.StudentDao;
import com.lin.dao.impl.StudentDaoimpl;
import com.lin.service.StudentService;

/*
 * 学生业务的实现类
*@author linone
*/
public class StudentServiceImpl implements StudentService{

	/**
	 * 功能交给dao实现 单一逻辑（查询）
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
		
		//对要显示到页面上的分页数据做个封装
		PageBean<Student> pageBean = new PageBean<Student>();
		pageBean.setCurrentPage(currentPage);//设置当前页
		pageBean.setPageSize(StudentDao.PAGE_SIZE);//设置每页的记录数
		StudentDao dao =new StudentDaoimpl();
		List<Student> finStudentByPage = dao.finStudentByPage(currentPage);
		pageBean.setList(finStudentByPage);//设置该页显示的学生对象
		int totalCount = dao.findCount();
		pageBean.setTotalSize(totalCount);//设置总记录数
		//能整除 就直接整除 不能整除 就要+1
		int pagecount = totalCount % StudentDao.PAGE_SIZE == 0? totalCount / StudentDao.PAGE_SIZE:(totalCount / StudentDao.PAGE_SIZE)+1;
		pageBean.setTotalPage(pagecount);//设置总页数

				
		return pageBean;
	}



}
