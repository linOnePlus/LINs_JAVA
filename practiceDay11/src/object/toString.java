package object;

public class toString {

	public static void main(String[] args) {
Person a= new Person();
System.out.println(a.toString());//未重写的tostring方法 返回对象的字符串显示
//重写的tostring方法用来显示属性

		
	}

}

class Person{
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
	public Person() {
		super();
		
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ",age=" + age + "]";
	}
}