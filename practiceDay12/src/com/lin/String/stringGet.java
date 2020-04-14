package com.lin.String;

public class stringGet {

	public static void main(String[] args) {

		String s1 ="linzejia_java";
		System.out.println(s1.length());
		System.out.println(s1.charAt(0));
		System.out.println(s1.indexOf(97/*字母一对应码表 可以传char,会自动类型提升*/));
		System.out.println(s1.indexOf('i'));
		System.out.println(s1.indexOf("in"));
		System.out.println(s1.indexOf("ia", 8));//从8索引开始找IA字符串
		System.out.println(s1.lastIndexOf(97));
		System.out.println(s1.lastIndexOf('i'));
		System.out.println(s1.substring(0));
		System.out.println(s1.substring(0,3));
		
		
	}

}
