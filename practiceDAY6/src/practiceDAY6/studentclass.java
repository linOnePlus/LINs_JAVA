package practiceDAY6;

public class studentclass {

	public static void main(String[] args) {
	student3 lin =new student3();//��������lin
	lin.name="�����";//������ó�Ա����(���з�����)
	lin.age=20;
	lin.gender="man";
	lin.study();//������ó�Ա����
    student3 lin2=new student3();
    lin2=lin;//lin��ֵַ��ֵ��lin2
    lin2.study();
   /* lin2=null;//��ָ���쳣 NULL��ֵ��LIN2 �ж�ջ�Ͷ�֮�����ϵ
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
String name ;//��Ա��������Ĭ�ϳ�ʼ��ֵ
int sum;//������һ��ʱ��ʹ��ʱ����ѭ�ͽ�ԭ��
public void text(){
	int sum=20;//�ֲ����� �����ڻ��������ڣ�û��Ĭ�ϳ�ʼ��ֵ
	System.out.println(name);
	System.out.println(sum);
	
}
}