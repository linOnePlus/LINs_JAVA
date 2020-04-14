package practiceDay1001;

public  class Person {
private String name;
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
private int age;
public Person(){}
public Person(String name,int age){
	this.name=name;
	this.age=age;
}
public void print(){
	System.out.println(this.getAge()+ "...."+this.getName());
}
protected void print2(){//protect关键字修饰的成员方法，不同包下的子类能访问得到。
	System.out.println("yes");
}
}
