package com.lin.javaENUM;

public class TEST {

	public static void main(String[] args) {
 week1();
 week2();
 Week3 mon = Week3.MON;
 mon.show();
	}

	private static void week2() {
		Week2 mon = Week2.MON;
		 System.out.println(mon.getName());
	}

	private static void week1() {
		Week1 mon = Week1.MON;
		 System.out.println(mon);
	}

}
