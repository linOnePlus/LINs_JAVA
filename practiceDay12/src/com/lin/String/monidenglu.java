package com.lin.String;
/*ģ���¼*/
import java.util.Scanner;

public class monidenglu {

	public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    for (int i = 1; i < 4; i++) {
    System.out.println("�������û���");
    String username =sc.next();
    System.out.println("����������");
    String password =sc.next();
    if (username.equals("admin")&&password.equals("admin")) {
    	/*����String���username�����equals�������ж�
    	 * �����е㲻�㣬Ӧ���ó���ADMIN����EQUALS��������ֹ���������NULL*/
		System.out.println("��¼�ɹ�");
		break;//����ѭ��
	} else{
		if(i==3){
			System.out.println("���Ĵ�������Ѿ��ﵽ���ֵ");
		}else{
			System.out.println("��¼ʧ�ܻ���"+(3-i)+"�λ���");//�㷨��������			
		}
	}
	}
    sc.close();
}
}
