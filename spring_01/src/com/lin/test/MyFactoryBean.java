package com.lin.test;

import org.springframework.beans.factory.FactoryBean;

import com.lin.bean.Car;

/*
*@author linone
*配置bean的第三种方式 通过factorybean来配置bean
*/
public class MyFactoryBean implements FactoryBean<Car>{

	@Override
	/*
	 * 返回bean实例
	 */
	public Car getObject() throws Exception {
		return new Car("BMW",222222);
	}

	@Override
	/*
	 * 返回bean的类型
	 */
	public Class<?> getObjectType() {
		return null;
	}

	@Override
	/*
	 * 是否单例
	 */
	public boolean isSingleton() {
		return false;
	}

}
