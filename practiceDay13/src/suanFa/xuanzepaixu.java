package suanFa;

public class xuanzepaixu {

	public static void main(String[] args) {
    int [] arr = {22,221,2312,112,3,34,}; 
    xuanZe(arr);
		print(arr);
	}

	private static void print(int [] arr) {
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j]+" ");
		}
	}

	public static void xuanZe(int [] arr){
		for (int i = 0; i < arr.length-1; i++) {//��㰴�±�˳��ѡ��һ��Ԫ��
			for (int j = i+1; j < arr.length; j++) {//�ڲ㰴�±�Ԫ��+1ѡ������һ��Ԫ����Ƚ�
				if (arr[i]>arr[j]) {//ǰ����ں��棬��Ҫ����˳��
					int temp =arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
}
