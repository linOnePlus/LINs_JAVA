package com.lin.superUtil;

public class Varargs {
	public static void main(String[] args) {
int [] arr = {22,11,33,44};
int max = getMax(arr);//可以穿传数组
System.out.println(max);
reload(1);
	}

	// 求若干个参数中最大的值 ， 若没传参数则返回int最小值
	public static int getMax(int... items) {
		int max = Integer.MIN_VALUE;
		for (int i : items) {
			max = i > max ? i : max;
		}
		return max;
	}
	// 返回比number大的数的个数
   public static int  getCount(int num , int...items) { //需要传固定参数和可变参数时， 可变参数一定要放在最后
	   int count = 0;
	   for (int i : items) {
		if (i>num) {
			count++;
		}
	}
	   return count;
   }
   public static void reload(int...items) {//重载时  优先匹配固定参数长度一样的
	   System.out.println(1);
   }
   public static void reload(int a ) {
	   System.out.println(2);
   }
}
