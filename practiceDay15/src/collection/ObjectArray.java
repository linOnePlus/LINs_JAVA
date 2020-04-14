package collection;

public class ObjectArray {

	public static void main(String[] args) {
     Student2 [] arr = new Student2[10];//定义一个引用类型数组
     for (int i = 0; i < arr.length; i++) {
		arr[i]= new Student2("LIN", 21);
		System.out.println(arr[i]);
	}
	}

}
class Student2{
	private String name ;
	private int age ;
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
	public Student2() {
		super();
		
	}
	@Override
	public String toString() {
		return "student [name=" + name + ", age=" + age + "]";
	}
	public Student2(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
}
