package practiceDay9;

public class practice_all {
     /**
	 * @param args 
	 */
	public static void main(String[] args) {
people a = new  student("linzejia",21);//����ת�ͣ�
a.method();
student p= (student)a;//ǿ������ת��,Ϊʹ���������з�����
p.love();
people b=new student();
double k=b.testrename(22,33);
System.out.print(k);
// ��������չʾ��̬�ĺô������������һ������ ������ȥ�������� ��ȥ�������� ����չ�ԣ�
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
	public abstract void method();//���󷽷��ĸ�ʽ��
	
	public double testrename(int a,int b){
		System.out.println("����fulei����");
		return a+b;
	}
}
class student extends people{
	student(){
	this("zhh" ,23);//���ñ����е��в������죬Ϊʲô����ֱ�Ӵ�NAME.AGE��
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
  public  double  testrename(int a,int b,int c){//�ٶȷ�����д����ϸ����Լ��ܽ� �����б���ͬ������ֵҲ��ͬ��
	  System.out.println("����zilei����");
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

