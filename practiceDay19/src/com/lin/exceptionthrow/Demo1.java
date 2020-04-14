package com.lin.exceptionthrow;
/*Å×³öÒì³£*/
public class Demo1 {
public static void main(String[] args) throws Exception   {
	Student s = new  Student();
	
		s.setAge(-1);

	System.out.println(s.getAge());
}
}
class Student{
	private  int age ;

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws Exception {
		
		if (age < 0 || age > 200) {
			throw new  Exception("age error");
		}else {
			this.age = age;
		}
	}

	public Student(int age) {
		super();
		this.age = age;
	}

	public Student() {
		super();
		
	}
	
}
