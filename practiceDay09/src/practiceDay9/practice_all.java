package practiceDay9;

public class practice_all {
     /**
	 * @param args 
	 */
	public static void main(String[] args) {
people a = new  student("linzejia",21);//向上转型；
a.method();
student p= (student)a;//强制向下转型,为使用子类特有方法。
p.love();
people b=new student();
double k=b.testrename(22,33);
System.out.print(k);
// 以下内容展示多态的好处：如果创建多一个子类 不用再去创建对象 再去创建方法 （扩展性）
create(new student());
create(new teacher());
	}
public static void create (people g){//people g= new student();
	g.method();
}

	
}
abstract class people{
	people(){
		System.out.println("zilei wucan");
	}
	people(String name,int  age){
		System.out.println("fulei youcan ");
	}
	public abstract void method();//抽象方法的格式；
	
	public double testrename(int a,int b){
		System.out.println("调用fulei方法");
		return a+b;
	}
}
class student extends people{
	student(){
	this("zhh" ,23);//调用本类中的有参数构造，为什么不能直接传NAME.AGE？
	}
  student(String name,int age){
	  super(name,age);
  }
  public void method(){
	  System.out.println("learning");
  }
  public void love(){
	  System.out.println("xuesheng zilei teyou fangfa love");
  }
  public  double  testrename(int a,int b,int c){//百度方法重写的详细概念，自己总结 参数列表相同，返回值也相同。
	  System.out.println("调用zilei方法");
	  return a*b*c;
  }
}
class teacher extends people{
	//super();
	public void method(){
		System.out.println("teching");
	}
	public void  love2(){
    System.out.println("teacher zilei teyou fangfa love2");
	}
}

