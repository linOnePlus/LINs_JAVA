import java.math.BigDecimal;


public class BigInteger {

	public static void main(String[] args) {
 double a =5.4;
 double b= 9;
 System.out.println(a/b);
 Big();
 }
public static void Big(){
	BigDecimal a = new BigDecimal("5.4");//����С����ȷ���㣬���ﹹ�췽������ֵҪSTRING����
	BigDecimal b = new BigDecimal("9");
    System.out.println(a.divide(b));
}

}
