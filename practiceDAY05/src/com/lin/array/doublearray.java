package com.lin.array;

public class doublearray {

	public static void main(String[] args) {
		//int []x,y[] x是一维，y是二维； int[]y[];
		int[][]array=new int[2][3];
		System.out.println(array);//二维数组地址值
		System.out.println(array[0]);//二维数组第一个一维素组的地址值
		System.out.println(array[0][0]);//二维数组第一个一维数组的第一个元素
		System.out.println("-------------------------");
		
		int[][]array1=new int[3][];
		System.out.println(array1[0]);
		System.out.println(array1[1]);//输出第二个一维数组，没赋值，所以为NULL
		System.out.println(array1[2]);//输出第三个一维数组，没赋值，所以为NULL
	    array1[0]=new int[3];
	    array1[1]=new int[3];
	    array1[2]=new int[3];//一维数组赋值方法
	    System.out.println(array1[0]);
	    System.out.println(array1[1]);//输出第二个一维数组的地址值，已经赋值所以可以找到地址值
	    System.out.println(array1[2]);//输出第三个一维数组的地址值，已经赋值所以可以找到地址值
		
		System.out.println("-------------------------");
		int[][]array2={{0,2,3},{2,2,4}};//二维数组，每个大括号代表一个一维数组。
		System.out.println(array2);
		System.out.println(array2[1]);
		System.out.println(array2[0][2]);//3
		System.out.println(array2[1][1]);//2
		
				
	}

}
