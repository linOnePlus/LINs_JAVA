package com.lin.String;

public class stringconstructors {
public static void main(String[] args) {
	
    byte [] arr = {83,97,98,99};//定义一个数组
	String a =  new String(arr);
	System.out.println(a.toString());
	int [] arr2 = {83,97,98,99};
	String b= new String(arr2,0,4);//从第0个索引开始，转4个数字为字符串
	System.out.println(b);
}
}
