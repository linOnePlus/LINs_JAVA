package com.lin.bean;
/*
*@author linone
*/

import java.util.List;

public class School {
private List<Student> student;

public List<Student> getStudent() {
	return student;
}

public void setStudent(List<Student> student) {
	this.student = student;
}

public School(List<Student> student) {
	super();
	this.student = student;
}

public School() {
	super();
	
}

@Override
public String toString() {
	return "School [student=" + student + "]";
}

}
