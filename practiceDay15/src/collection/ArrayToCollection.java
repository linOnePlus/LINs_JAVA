package collection;

import java.util.Arrays;//��������ASlist����
import java.util.List;

public class ArrayToCollection {

	public static void main(String[] args) {
     int  [] arr = new  int  [] {11,22,33,44};
     List<int[]> asList = Arrays.asList(arr);
     System.out.println(asList);
     for (int[] is : asList) {
		System.out.println(is);  //����������鵱��һ������
	}
     //������������Ǹ�������������
     Integer [] arr2= {11,22,33,44,55};
     Arrays.asList(arr2);
     for (Integer integer : arr2) {
		System.out.print(integer);
	}
	}

}
