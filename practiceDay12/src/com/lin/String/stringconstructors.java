package com.lin.String;

public class stringconstructors {
public static void main(String[] args) {
	
    byte [] arr = {83,97,98,99};//����һ������
	String a =  new String(arr);
	System.out.println(a.toString());
	int [] arr2 = {83,97,98,99};
	String b= new String(arr2,0,4);//�ӵ�0��������ʼ��ת4������Ϊ�ַ���
	System.out.println(b);
}
}
