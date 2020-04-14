package com.lin.test;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/*
*@author linone
*ʵ��bean�ĺ��ô�����
*/
public class MyBeanPostProcessor implements BeanPostProcessor {

	@Override//initִ�к�ǰ�ķ���
	public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException {
		//agr0��ʾ���ظ��û���bean arg1��ʾ�����ļ�������bean��id
		if (arg1.equals("car2")) { //������ô�����ֻ��idΪcar2����Ч
			System.out.println("postProcessAfterInitialization"+arg0+" "+arg1);
		}
		return arg0;			
	}

	@Override//init ִ��ǰ�ķ���
	public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException {
		if (arg1.equals("car2")) { //������ô�����ֻ��idΪcar2����Ч
			System.out.println("postProcessBeforeInitialization"+arg0+" "+arg1);
		}
		return arg0;
	}

}
