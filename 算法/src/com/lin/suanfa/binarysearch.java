package com.lin.suanfa;
/*
*@author linoneplus
*演示二分查找
*/
public class binarysearch {

	public static void main(String[] args) {

		int  [] arr= {11,22,33,44};
		int search = search(arr, 44);
		System.out.println(search);
	}

	public static int search(int [] arr , int key) {
		int min = 0;
		int max = arr.length-1;
		while (max>=min) {
			int mid = (min + max)/2;//每次mid的值都会发生改变
			if (arr[mid]<key) {
				min = mid +1;
			}else if (arr[mid]>key) {
				max=mid-1;
			}else {
				return mid;
			}
		}
		
		return -1;
	}
}
