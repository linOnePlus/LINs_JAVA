package collection;

import java.util.Arrays;//这个类里的ASlist方法
import java.util.List;

public class ArrayToCollection {

	public static void main(String[] args) {
     int  [] arr = new  int  [] {11,22,33,44};
     List<int[]> asList = Arrays.asList(arr);
     System.out.println(asList);
     for (int[] is : asList) {
		System.out.println(is);  //会把整个数组当成一个对象
	}
     //传的数组必须是个引用数据类型
     Integer [] arr2= {11,22,33,44,55};
     Arrays.asList(arr2);
     for (Integer integer : arr2) {
		System.out.print(integer);
	}
	}

}
