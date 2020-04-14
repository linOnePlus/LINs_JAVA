package arrays;

import java.util.Arrays;

public class arrays {
 public static void main(String[] args) {
	int [] arr={2232,23,11,23,12,3,32,222};
	String a=Arrays.toString(arr);//数组转字符串
	System.out.println(a);
	
    Arrays.sort(arr);//数组排序
    System.out.print("[");
    for (int i = 0; i < arr.length; i++) {
		int j = arr[i];
		System.out.print(j+" ");
	}
    System.out.print("]");
    System.out.println();
    
    int c = Arrays.binarySearch(arr, 11);//二分查找11元素的索引
    System.out.println(c);
    
}
}
