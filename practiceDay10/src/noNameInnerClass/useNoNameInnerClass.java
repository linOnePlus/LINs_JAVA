package noNameInnerClass;

public class useNoNameInnerClass {
//��ε���PersonDemo �� method����
	public static void main(String[] args) {
    PersonDemo pd =new PersonDemo();
    pd.method(new Person(){
    	public void show(){
    		System.out.println("���óɹ�");
    	}
    }//������������new Peroson(){}���������Person���������;
    );
    // ֱ�Ӵ�new person ();���г����಻�ܴ�������ֻ��ͨ����������� ���������ڲ��ࣻ
		
		
	}

}
abstract class Person{
	public abstract void show();
}

class PersonDemo{
	public void method(Person p){
		p.show();
	}
}
