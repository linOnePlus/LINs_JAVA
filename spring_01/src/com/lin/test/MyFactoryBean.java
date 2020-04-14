package com.lin.test;

import org.springframework.beans.factory.FactoryBean;

import com.lin.bean.Car;

/*
*@author linone
*����bean�ĵ����ַ�ʽ ͨ��factorybean������bean
*/
public class MyFactoryBean implements FactoryBean<Car>{

	@Override
	/*
	 * ����beanʵ��
	 */
	public Car getObject() throws Exception {
		return new Car("BMW",222222);
	}

	@Override
	/*
	 * ����bean������
	 */
	public Class<?> getObjectType() {
		return null;
	}

	@Override
	/*
	 * �Ƿ���
	 */
	public boolean isSingleton() {
		return false;
	}

}
