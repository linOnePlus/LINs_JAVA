package com.lin.array;

public class doublearray {

	public static void main(String[] args) {
		//int []x,y[] x��һά��y�Ƕ�ά�� int[]y[];
		int[][]array=new int[2][3];
		System.out.println(array);//��ά�����ֵַ
		System.out.println(array[0]);//��ά�����һ��һά����ĵ�ֵַ
		System.out.println(array[0][0]);//��ά�����һ��һά����ĵ�һ��Ԫ��
		System.out.println("-------------------------");
		
		int[][]array1=new int[3][];
		System.out.println(array1[0]);
		System.out.println(array1[1]);//����ڶ���һά���飬û��ֵ������ΪNULL
		System.out.println(array1[2]);//���������һά���飬û��ֵ������ΪNULL
	    array1[0]=new int[3];
	    array1[1]=new int[3];
	    array1[2]=new int[3];//һά���鸳ֵ����
	    System.out.println(array1[0]);
	    System.out.println(array1[1]);//����ڶ���һά����ĵ�ֵַ���Ѿ���ֵ���Կ����ҵ���ֵַ
	    System.out.println(array1[2]);//���������һά����ĵ�ֵַ���Ѿ���ֵ���Կ����ҵ���ֵַ
		
		System.out.println("-------------------------");
		int[][]array2={{0,2,3},{2,2,4}};//��ά���飬ÿ�������Ŵ���һ��һά���顣
		System.out.println(array2);
		System.out.println(array2[1]);
		System.out.println(array2[0][2]);//3
		System.out.println(array2[1][1]);//2
		
				
	}

}
