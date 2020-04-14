package com.lin.genercity;

public class demo1 {

	public static void main(String[] args) {
		Student s= new Student("lin", 2);
   Tool<Student> t =new  Tool<>();
   t.setQ(s);
   Student q = t.getQ();
   System.out.println(q);
	}

}

class Tool<Q>{
	private Q q;

	public Q getQ() {
		return q;
	}

	public void setQ(Q q) {
		this.q = q;
	}
	
}
class  Student{
	private String  name; 
	 private  int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	 
}