package com.lin.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lin.aop.ArithmeticCalculator;
import com.lin.aop.ArithmeticCalculatorImpl;

/*
*@author linone
*/
public class Test01 {
public static void main(String[] args) {
	
	ApplicationContext applicationContext = new  ClassPathXmlApplicationContext("applicationContext.xml");
	ArithmeticCalculator arithmeticCalculatorImpl = (ArithmeticCalculator) applicationContext.getBean("aa");
	 arithmeticCalculatorImpl.add(1, 2);
		/* arithmeticCalculatorImpl.div(3, 0); */
	
}
}
