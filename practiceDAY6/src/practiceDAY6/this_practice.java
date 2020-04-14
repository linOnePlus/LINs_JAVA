package practiceDAY6;

import javax.print.attribute.Size2DSyntax;

public class this_practice {

	public static void main(String[] args) {
		Student s1=new Student();
   s1.setName("林泽佳");
   System.out.print(s1.getName());
   Student s2=new Student();
   System.out.print(s2.getName());//name 被修饰为静态，在内存方法区里。每个对象都会有Day7的知识
	}
 
}
class Student{
	private static String name;//每个对象共有的特点才能定义为静态
	public  void  setName (String name){
		this.name=name;//静态方法不能用THIS 关键字，方法调用时可能还没有创建对象
		//这里的THIS代表S1,S1对象来调用setName方法 this就代表S1。	
	}
	public static String getName(){
		return name;
	}
}