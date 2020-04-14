package practiceDay9;

public class practice9_12 {

	public static void main(String[] args) {
	Cat a=new Cat("runhoo",22);
		System.out.println(a.getAge()+"..."+a.getName());
		a.eat();
		a.catchMouse();
	   Dog d=new Dog("zotura",21);
	   d.eat();
	   d.lookHome();
	   System.out.println(d.getAge()+"..."+d.getName());

	}
	

}
abstract class Animal{
	private String name;
	private int age;
	public Animal(){}
	public Animal(String name,int age){
		this.name=name;
		this.age=age;
	}
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
	public abstract void  eat();
	

}
class Cat extends Animal{
	public Cat(){}
	public Cat(String name ,int age){
		super(name,age);
	}
	public void eat(){
		System.out.println("cat eat");
	}
	public void catchMouse(){
		System.out.println("catch mouse");
	}
}
class Dog extends Animal{
	public Dog(){}
	public Dog(String name ,int age){
		super(name,age);
	}
	public void eat(){
		System.out.println("dog eat");
	}
	public void lookHome(){
		System.out.println("lookHome");
	}
}
