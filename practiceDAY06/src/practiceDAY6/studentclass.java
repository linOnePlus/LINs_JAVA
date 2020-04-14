package practiceDAY6;

public class studentclass {

	public static void main(String[] args) {
	student3 lin =new student3();//创建对象lin
	lin.name="林泽佳";//对象调用成员变量(类中方法外)
	lin.age=20;
	lin.gender="man";
	lin.study();//对象调用成员方法
    student3 lin2=new student3();
    lin2=lin;//lin地址值赋值给lin2
    lin2.study();
   /* lin2=null;//空指针异常 NULL赋值给LIN2 切断栈和堆之间的联系
    lin2.study();*/
    
    path s =new  path();
    s.text();
	}

}
class student3{
	String name;
	int age;
	String gender;
	public void study(){
		System.out.println(name+"   "+age+"  "+gender);
	}
}
class path{
String name ;//成员变量，有默认初始化值
int sum;//变量名一样时，使用时候遵循就近原则
public void text(){
	int sum=20;//局部变量 方法内或者声明内，没有默认初始化值
	System.out.println(name);
	System.out.println(sum);
	
}
}