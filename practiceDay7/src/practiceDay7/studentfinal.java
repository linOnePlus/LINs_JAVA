package practiceDay7;

public class studentfinal {

	public static void main(String[] args) {
	Student p1=new Student();
	p1.setName("��");
	p1.setAge(21);
	System.out.println(p1.getName()+"..."+p1.getAge());
	//getxxx()����������������ӡ��Ҳ����������������������ֵ�������ȣ���
	Student p2=new Student("��",22);
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
