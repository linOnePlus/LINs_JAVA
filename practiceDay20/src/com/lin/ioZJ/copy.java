package com.lin.ioZJ;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
*@author linone
*/
public class copy {

	public static void main(String[] args) throws IOException {
		
		method1();//ֱ�ӿ���
		method2();//����С���鿽��
		
	}

	private static void method2() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("linzejia.txt");
		FileOutputStream fos = new FileOutputStream("copy3.txt");
		byte [] arr= new byte [1024];
		int len ;
		while ((len=fis.read(arr))!=-1) {
			fos.write(arr,0,len);
		}
		fis.close();
		fos.close();
		
	}

	private static void method1() throws FileNotFoundException, IOException {
		java.io.FileInputStream fis = new java.io.FileInputStream("linzejia.txt");
		FileOutputStream fos = new FileOutputStream("copy2.txt");
		int b ;//һ��Ҫ�ֲ����� ÿ��read��������ֵ��ͬ
		while ((b=fis.read())!=-1) {
			fos.write(b);
		}
		fis.close();
		fos.close();
	}
	
	
}
