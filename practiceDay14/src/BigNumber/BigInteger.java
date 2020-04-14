package BigNumber;

import java.math.BigDecimal;

public class BigInteger {

	public static void main(String[] args) {
		java.math.BigInteger bigInteger = new java.math.BigInteger("8000000000000000000000000000000");
		System.out.println(bigInteger.add(new java.math.BigInteger("555555555555555555")));
		nobig();
		Big();

	}

	private static void nobig() {
		double a = 5.4;
		double b = 9;
		System.out.println(a / b);
	}

	public static void Big() {
		BigDecimal a = new BigDecimal("5.4");// bigdecimal进行小数精确计算，这里构造方法传的值要STRING类型
		BigDecimal b = new BigDecimal("9");
		System.out.println(a.divide(b));
	}

}
