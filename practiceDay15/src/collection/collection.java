package collection;

import java.util.ArrayList;
import java.util.Collection;
/*
 * ����ֻ�ܴ���� 
 * ���ϵĳ��ȿ��Ըı� �������鲻����
 * */
public class collection {

	public static void main(String[] args) {
Collection c = new ArrayList();
c.add("zifuhcuan");
c.add(new Student());//����ֵboolean ����ArrayList���Դ洢�ظ�Ԫ��������ԶΪTURE����bOOLEAN����������
System.out.println(c);//��Ӷ��������ǵ����������toString
c.remove("zifuhcuan");//��������ɾ����
System.out.println(c);
System.out.println(c.contains("zifuchuan"));//�Ƿ����
System.out.println(c.isEmpty());//�����Ƿ�Ϊ��
System.out.println(c.size());//������Ԫ�صĸ���
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
