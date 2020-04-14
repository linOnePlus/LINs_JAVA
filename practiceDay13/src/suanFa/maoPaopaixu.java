package suanFa;

public class maoPaopaixu {

	public static void main(String[] args) {
 int [] arr = {22,33,123,11,323,32};
 int[]arr2=method1(arr);
 print(arr2);
	}

	private static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
//冒泡排序法，选择相邻的两个元素相比较，大的往右走
	public static int[] method1(int[]arr){
		for (int i = 1; i < arr.length; i++) {//比较length-1次 每次都排出一个最大值 
			for (int j = 0; j < arr.length-i; j++) {//每次都出现一个最大值，所以参加比较的元素-i个
				if (arr[j]>arr[j+1]) {
			   int  temp = arr[j];
			   arr[j]=arr[j+1];
			   arr[j+1]=temp;
				}
			   
			}
		}
		return arr;
	}
	
}
