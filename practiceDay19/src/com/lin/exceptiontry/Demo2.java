package com.lin.exceptiontry;

public class Demo2 {

	public static void main(String[] args) {
try {
	System.out.println(10/0);
	System.out.println(10/2);//出错后不再执行
} catch (ArithmeticException e) {//被第一个抓了 小的异常放前面 放后面会报错
	System.out.println("chushuwei0");
}catch (Exception e) {
	System.out.println("chucuole");
}
	}

}
