package com.lin.array;

public class copyarray {
public static void main(String[] args) {
	
	int arr2[]=new  int[10];
	int [] arr =new int[arr2.length];
	for (int i = 0; i < arr2.length; i++) {
		arr2[i]=i;
		System.out.print(arr2[i]);
		arr[i]=arr2[i];
	}
	
	System.out.println("\n拷贝后的数组为");
	for (int i : arr) {
		System.out.print(i);
	}

}
}
