package practiceDAY5;
//取最值以及数组反转以及遍历
public class arraygetMaxandReverse {

	public static void main(String[] args) {
	 int [] ex=new int []{11,22,1323,221,1122,1223};
	 int a=getMax(ex);
	 System.out.print("max number is " +a);
	 reverse(ex);
	 System.out.println("reverse result is");
	 print(ex);
	}
public static int getMax(int [] arr1){
	int max= arr1[0];
	for(int i=1;i<arr1.length;i++){//比武招亲法。arr1.length数组名+.length表示数组长度
		if(arr1[i]>max)
			max=arr1[i];
	}
	return max;
}
public static void reverse(int []a)
{
	for(int i=0;i<a.length/2;i++){
		
		int temp=a[a.length-1-i];
		a[a.length-1-i]=a[i];
		temp=a[i];
	}
}
public static void print(int[] lin){//方法定义的只是形式参数，在这个方法里有用而已 
	  for(int i=0;i<lin.length;i++){
		  System.out.print(lin[i]+" ");
	  }
}
}