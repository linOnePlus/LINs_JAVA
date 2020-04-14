package com.lin.array;
import java.util.Scanner;
//元素索引以及查表法
public class arraypractice3 {

	public static void main(String[] args) {
	int []arr=new int[]{11,13,22,1122,3332};
	System.out.println("please input number between 1 to 7");
	 Scanner sb= new Scanner(System.in);
	 int a =sb.nextInt();
	 char b=getDay(a);
	 System.out.println("星期"+b);
	 System.out.println("please input number");
	 int x =sb.nextInt();
	 int g=getIdex(arr,x);
	 System.out.println("元素的索引是 "+g);
	 sb.close();
	}

  public static char getDay(int x){//数组查表法
	  char [] week = new char[]{' ','一','二','三','四','五','六','日',};
	  return week[x];
  }
  
  public static int getIdex(int [] arr ,int x){
	  for(int i= 0;i<arr.length;i++){
		  if(arr[i]==x){
			return i;
		  }
	  }
	  return -1;
  }
}
