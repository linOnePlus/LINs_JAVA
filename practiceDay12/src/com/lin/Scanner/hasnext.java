package com.lin.Scanner;

import java.util.Scanner;

public class hasnext {

	public static void main(String[] args) {
while (true){
   Scanner sc =new Scanner(System.in);
   if (sc.hasNextFloat()) {//判断是否浮点数
	   Float x=sc.nextFloat();
	   System.out.println(x);
	}else {
		System.out.println("有误");
	}
   
	}
	}

}
