package com.lin.suanfa;
/*
*@author linoneplus
*/
public class zuixiao {
public static void main(String[] args) {
	int min = searchMin(3,6,7);
	System.out.println(min);
	
}
public static int searchMin(int a, int b ,int c ){

	 if(a <= b && a <=c){
	 return a;
	 }
	 if(b <= a && b <= c){
	 return b;
	}
	  if(c <= a && c <= b){
	 return c;
	}
	return -1;
	}
}
