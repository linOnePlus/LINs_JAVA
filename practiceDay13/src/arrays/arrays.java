package arrays;

import java.util.Arrays;

public class arrays {
 public static void main(String[] args) {
	int [] arr={2232,23,11,23,12,3,32,222};
	String a=Arrays.toString(arr);//����ת�ַ���
	System.out.println(a);
	
    Arrays.sort(arr);//��������
    System.out.print("[");
    for (int i = 0; i < arr.length; i++) {
		int j = arr[i];
		System.out.print(j+" ");
	}
    System.out.print("]");
    System.out.println();
    
    int c = Arrays.binarySearch(arr, 11);//���ֲ���11Ԫ�ص�����
    System.out.println(c);
    
}
}
