package com.lin.exceptiontry;

public class Demo2 {

	public static void main(String[] args) {
try {
	System.out.println(10/0);
	System.out.println(10/2);//�������ִ��
} catch (ArithmeticException e) {//����һ��ץ�� С���쳣��ǰ�� �ź���ᱨ��
	System.out.println("chushuwei0");
}catch (Exception e) {
	System.out.println("chucuole");
}
	}

}
