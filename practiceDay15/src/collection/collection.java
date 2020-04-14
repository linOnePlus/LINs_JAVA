package collection;

import java.util.ArrayList;
import java.util.Collection;
/*
 * 集合只能存对象 
 * 集合的长度可以改变 对象数组不可以
 * */
public class collection {

	public static void main(String[] args) {
Collection c = new ArrayList();
c.add("zifuhcuan");
c.add(new Student());//返回值boolean 但是ArrayList可以存储重复元素所以永远为TURE不用bOOLEAN类型来接受
System.out.println(c);//添加对象后输出是调用类里面的toString
c.remove("zifuhcuan");//匿名对象删不了
System.out.println(c);
System.out.println(c.contains("zifuchuan"));//是否包含
System.out.println(c.isEmpty());//集合是否为空
System.out.println(c.size());//集合中元素的个数
}

}
class Student{
	String name ;
	int age ;
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
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Student() {
		super();
		
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
}
