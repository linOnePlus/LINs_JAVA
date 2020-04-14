import java.math.BigDecimal;


public class BigInteger {

	public static void main(String[] args) {
 double a =5.4;
 double b= 9;
 System.out.println(a/b);
 Big();
 }
public static void Big(){
	BigDecimal a = new BigDecimal("5.4");//进行小数精确计算，这里构造方法传的值要STRING类型
	BigDecimal b = new BigDecimal("9");
    System.out.println(a.divide(b));
}

}
