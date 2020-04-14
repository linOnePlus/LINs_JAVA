package practiceDay9;
//����һ�����߽ӿڣ���������չ���ܣ����Բ���ÿһֻè�������� ����дһ��è������ʵ������ӿڣ������ṩ����
public class interfacepracticeJumpcat {

	public static void main(String[] args) {
		jumpCat2 a= new jumpCat2("lin",22);
        a.jump();
        a.eat();
        a.sleep();
	}

}
abstract class Animal2{//�����ඨ�干������ �ӿڶ�����������
    private String name;
	private int age;	
	public Animal2(){}
	public Animal2(String name,int age){
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
	public abstract void sleep();
}
class Cat2 extends Animal2{
	public  Cat2(){}
	public  Cat2(String name,int age){
		super(name,age);
	}
	public void eat(){
		System.out.println("cat eat");
	}
	public void sleep(){
		System.out.println("cat sleep");
	}
}
interface jumping{
	public abstract void jump();//Ĭ��public abstract 
}
class jumpCat2 extends Cat2 implements jumping{//��implementsʵ��
	public jumpCat2(){}
	public jumpCat2(String name,int age){
		super(name,age);
	}
	public void jump(){
		System.out.println(this.getName()+"..."+"����è"+"..."+this.getAge());
	}
}