package com.lin.array;
import java.util.Scanner;
//Ԫ�������Լ����
public class arraypractice3 {

	public static void main(String[] args) {
	int []arr=new int[]{11,13,22,1122,3332};
	System.out.println("please input number between 1 to 7");
	 Scanner sb= new Scanner(System.in);
	 int a =sb.nextInt();
	 char b=getDay(a);
	 System.out.println("����"+b);
	 System.out.println("please input number");
	 int x =sb.nextInt();
	 int g=getIdex(arr,x);
	 System.out.println("Ԫ�ص������� "+g);
	 sb.close();
	}

  public static char getDay(int x){//������
	  char [] week = new char[]{' ','һ','��','��','��','��','��','��',};
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
