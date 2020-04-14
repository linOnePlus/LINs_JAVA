package com.lin.Scanner;

import java.util.Scanner;

public class Scannerquestion {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);

System.out.println("请输入一个整数");
int i =sc.nextInt();
System.out.println("请输入一个字符串");
String a=sc.nextLine();//出现异常 用next()方法可以解决。

System.out.println(i+a);
	}

}
