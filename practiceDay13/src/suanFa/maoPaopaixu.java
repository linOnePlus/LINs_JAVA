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
//ð�����򷨣�ѡ�����ڵ�����Ԫ����Ƚϣ����������
	public static int[] method1(int[]arr){
		for (int i = 1; i < arr.length; i++) {//�Ƚ�length-1�� ÿ�ζ��ų�һ�����ֵ 
			for (int j = 0; j < arr.length-i; j++) {//ÿ�ζ�����һ�����ֵ�����ԲμӱȽϵ�Ԫ��-i��
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
