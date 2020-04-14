package com.lin.test;
/*
*@author linone
*��̬����������ȡBeanʵ��
*/

import java.util.HashMap;
import java.util.Map;

import com.lin.bean.Car;

public class StaticBeanFacory {

	private static Map<String, Car>  cars =new HashMap<String, Car>();
	
	static {
		cars.put("1", new Car("aodi", 2000));
	}
	
	public static Car getCar(String name) {
		return cars.get(name);
	}
}
