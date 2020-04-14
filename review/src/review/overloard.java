package review;

public class overloard {

	public static void main(String[] args) {
		double a=add(10,20);
//这个例子说明方法重载与返回值类型没有关系，如果ADD方法想返回一个double类型的值，直接用double a 去接收就可以了，不用再写一个方法
		int b= (int)add1(10.3,10.5);
		//精度大 的用小的类型去接 会报错，要强制转换
	}
public static int add(int a,int b){
	return a +b;
}

public static double add1(double a,double b){
	return a+b;
}
}
