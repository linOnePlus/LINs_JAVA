package com.lin.String;

public class stringChange {

	public static void main(String[] args) {
    String str = "林泽佳";
   System.out.println(str.getBytes());//打印数组的地址值,返回值是一个字节数组；
    method1(str);
    method2(str);
    method3();
    method4();
    
	}

	private static void method4() {
		int i=998;
		System.out.println(String.valueOf(i)+66);//把int转化成字符串类型
	}

	private static void method3() {
		char [] arr ={'a','b','c'};
		 String a = String.valueOf(arr) ;//静态方法直接类名丶调用就行了;
		 System.out.println(a);
	}

	private static void method2(String str) {
		char [] arr= str.toCharArray();//字符串转换成一个CHAR数组
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
			
		}System.out.println();
	}

	private static void method1(String str) {
		byte [] arr  = str.getBytes();//字符串根据码表转换成BYTE数组
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");	
			
		}System.out.println();
	}

}
