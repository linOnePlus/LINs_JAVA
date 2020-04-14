package com.lin.suanfa;

import java.util.Arrays;

/*
*@author linone
*/
public class maopao {
	public static void main(String[] args) {
int [] arr= {33,11,22,45};
	maopao(arr);
	System.out.println(Arrays.toString(arr));
	}

	public static void maopao(int[] arr) {
		int temp;// 定义一个临时变量

		for (int i = 0; i < arr.length - 1; i++) {// 循环次数 

			for (int j = 0; j < arr.length - i - 1; j++) {//两两比较，每次循环就少比较一个（找出了最大值）

				if (arr[j + 1] < arr[j]) {

					temp = arr[j];

					arr[j] = arr[j + 1];

					arr[j + 1] = temp;
				}
			}
		}

	}
}