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
		for (int i = 0; i < arr.length-1; i++) {//外层按下标顺序选择一个元素
			for (int j = i+1; j < arr.length; j++) {//内层按下标元素+1选择另外一个元素相比较
				if (arr[i]>arr[j]) {//前面大于后面，就要交换顺序
					int temp =arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
}
