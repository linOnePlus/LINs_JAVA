package com.lin.test;

import java.util.HashMap;
import java.util.Map;

import com.lin.bean.Car;

/*
*@author linone
*实例化工厂的方式来创建bean
*/
public class InstanceBeanFactory {

	private Map<String, Car>  car = new HashMap<String, Car>();
	public InstanceBeanFactory() {
		car.put("1", new Car("baoma", 20202020));
	}
	public Car getInstance(String name) {
		return car.get(name);
	}
}
