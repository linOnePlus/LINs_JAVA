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
		int temp;// ����һ����ʱ����

		for (int i = 0; i < arr.length - 1; i++) {// ѭ������ 

			for (int j = 0; j < arr.length - i - 1; j++) {//�����Ƚϣ�ÿ��ѭ�����ٱȽ�һ�����ҳ������ֵ��

				if (arr[j + 1] < arr[j]) {

					temp = arr[j];

					arr[j] = arr[j + 1];

					arr[j + 1] = temp;
				}
			}
		}

	}
}