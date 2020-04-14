package com.lin.test;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/*
*@author linone
*实现bean的后置处理器
*/
public class MyBeanPostProcessor implements BeanPostProcessor {

	@Override//init执行后前的方法
	public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException {
		//agr0表示返回给用户的bean arg1表示配置文件中所有bean的id
		if (arg1.equals("car2")) { //这个后置处理器只对id为car2的有效
			System.out.println("postProcessAfterInitialization"+arg0+" "+arg1);
		}
		return arg0;			
	}

	@Override//init 执行前的方法
	public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException {
		if (arg1.equals("car2")) { //这个后置处理器只对id为car2的有效
			System.out.println("postProcessBeforeInitialization"+arg0+" "+arg1);
		}
		return arg0;
	}

}
