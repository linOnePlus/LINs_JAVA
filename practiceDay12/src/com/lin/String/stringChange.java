package com.lin.String;

public class stringChange {

	public static void main(String[] args) {
    String str = "�����";
   System.out.println(str.getBytes());//��ӡ����ĵ�ֵַ,����ֵ��һ���ֽ����飻
    method1(str);
    method2(str);
    method3();
    method4();
    
	}

	private static void method4() {
		int i=998;
		System.out.println(String.valueOf(i)+66);//��intת�����ַ�������
	}

	private static void method3() {
		char [] arr ={'a','b','c'};
		 String a = String.valueOf(arr) ;//��̬����ֱ������ؼ���þ�����;
		 System.out.println(a);
	}

	private static void method2(String str) {
		char [] arr= str.toCharArray();//�ַ���ת����һ��CHAR����
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
			
		}System.out.println();
	}

	private static void method1(String str) {
		byte [] arr  = str.getBytes();//�ַ����������ת����BYTE����
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");	
			
		}System.out.println();
	}

}
