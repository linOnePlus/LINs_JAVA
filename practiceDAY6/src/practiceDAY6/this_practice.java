package practiceDAY6;

import javax.print.attribute.Size2DSyntax;

public class this_practice {

	public static void main(String[] args) {
		Student s1=new Student();
   s1.setName("�����");
   System.out.print(s1.getName());
   Student s2=new Student();
   System.out.print(s2.getName());//name ������Ϊ��̬�����ڴ淽�����ÿ�����󶼻���Day7��֪ʶ
	}
 
}
class Student{
	private static String name;//ÿ�������е��ص���ܶ���Ϊ��̬
	public  void  setName (String name){
		this.name=name;//��̬����������THIS �ؼ��֣���������ʱ���ܻ�û�д�������
		//�����THIS����S1,S1����������setName���� this�ʹ���S1��	
	}
	public static String getName(){
		return name;
	}
}