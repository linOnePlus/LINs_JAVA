package review;

public class overloard {

	public static void main(String[] args) {
		double a=add(10,20);
//�������˵�����������뷵��ֵ����û�й�ϵ�����ADD�����뷵��һ��double���͵�ֵ��ֱ����double a ȥ���վͿ����ˣ�������дһ������
		int b= (int)add1(10.3,10.5);
		//���ȴ� ����С������ȥ�� �ᱨ��Ҫǿ��ת��
	}
public static int add(int a,int b){
	return a +b;
}

public static double add1(double a,double b){
	return a+b;
}
}
