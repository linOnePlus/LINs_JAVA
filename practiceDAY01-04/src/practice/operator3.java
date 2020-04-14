package practice;

public class operator3 {

	public static void main(String[] args) {
		byte a =126;
		a+=6;//+=，-=，*=，/=；都是左边和右边运算结果赋值给左边，并且自动加强制转换。类似于a=(byte)(a+6);
		System.out.println(a);

	}

}
