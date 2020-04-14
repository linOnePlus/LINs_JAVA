package practice;

public class Coercive {

	public static void main(String[] args) {
		int a=5000;
		byte b = 100;
		b=(byte) (a+b);//结果超出了BYTE的取值范围
		System.out.print(b);

	}

}
