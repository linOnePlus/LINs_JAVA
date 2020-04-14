package practiceDay7;

public class studentfinal {

	public static void main(String[] args) {
	Student p1=new Student();
	p1.setName("林");
	p1.setAge(21);
	System.out.println(p1.getName()+"..."+p1.getAge());
	//getxxx()方法可以用来给打印，也可以用来做其他操作（赋值给变量等）。
	Student p2=new Student("陈",22);
	p2.show();

	}

}
class Student {
	private String name;
	private int age;
	
	public Student(){
		
	}
	public Student(String name,int age ){
		this.name=name;
		this.age=age;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public String getName(){
		return this.name;
	}
	public void setAge(int  age){
		this.age= age;
	}
	
	public int getAge(){
		return this.age;
	}
	public void show(){
		System.out.println(this.name+"..."+this.age);
	}
}
