package suanFa;

public class erfenchazhao {

	public static void main(String[] args) {
     int [] arr={22,33,44,55,66,77,88};
	System.out.println(erfen(arr, 44));
	}

	public static int erfen(int [] arr, int i){
		int min = 0;
		int max = arr.length-1;
		int mid = (min + max )/2;
		while (arr[mid]!=i) {
			if (i>arr[mid]) {
				min = mid +1;
			}
			if(arr[mid]>i){
				max = mid -1;
			}
			mid = (min +max)/2;
			if(min> max){
				return -1;
			}
		}
		
		return mid;
		
	}
}
