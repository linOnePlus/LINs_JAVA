package object;

public class hashcode_getClass {

	public static void main(String[] args) {
 student s1=new student();
 System.out.println(s1.hashCode());//返回该对象的逻辑地址值
 Class b =s1.getClass();//getClass返回值类型Class 
 String s1name=b.getName();//b.getName获取名字
 System.out.println(s1name);
	
	}

}
class student{
	String name;
	int age;
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
	public student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public student() {
		super();
		
	}
	
}
