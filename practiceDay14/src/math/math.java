package math;
//数学运算类MATH
public class math {
public static void main(String[] args) {
	System.out.println(Math.abs(-2323.11));
	System.out.println(Math.cbrt(8));//开立方根
	System.out.println(Math.log(8));
	int b=(int)(Math.random()*10);//后面*10一定要用括号。结果0-1之间的数，不加括号强制转换成Int 结果就是0
	System.out.println(b);
}
}
