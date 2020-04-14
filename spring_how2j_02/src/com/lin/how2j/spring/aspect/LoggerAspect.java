package com.lin.how2j.spring.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/*
*@author linone
*����־����Ĺ����� �ڵ��ú��Ĺ���֮ǰ��֮��ֱ��ӡ��־
*@Aspect ע���ʾ����һ������
@Component ��ʾ����һ��bean,��Spring���й���
@Around(value = "execution(* com.how2java.service.ProductService.*(..))") ��ʾ��com.how2java.service.ProductService ������е����з��������������
*/
@Aspect
@Component
public class LoggerAspect {
	@Around(value = "execution(* com.lin.how2j.spring.service.ProductService.*(..))")
	  public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
	        System.out.println("start log:" + joinPoint.getSignature().getName());
	        Object object = joinPoint.proceed();
	        System.out.println("end log:" + joinPoint.getSignature().getName());
	        return object;
	    }

}
