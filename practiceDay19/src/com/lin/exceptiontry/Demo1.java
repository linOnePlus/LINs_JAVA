package com.lin.exceptiontry;

public class Demo1 {

	public static void main(String[] args) {
try {
	int x = 10 / 0;
	System.out.println(x);
} catch (Exception e) {
	System.out.println("chucuole");
}
try {
	System.out.println(10/0);
	System.out.println(111);
} catch (Exception e) {
	System.out.println("2222");
}
	}


}
