package practiceDay8;

public class extendpractice {

	public static void main(String[] args) {
	cat c1=new cat();
	c1.show();

	}

}
class cat extends animal{//����ͬ����ִ���Լ����е�ͬ������
	public static void show(){
		System.out.println("����ͬ�������ʲô���");
	}
}
class animal{
	public static void show(){
		System.out.println("����ͬ�������ʲô���ne");
	}
}