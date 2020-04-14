package com.lin.aop;

import java.util.Arrays;
import java.util.List;

import org.aspectj.internal.lang.annotation.ajcDeclareAnnotation;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/*
*@author linone
*�������� �Ȱ�����Ž�ioc������
* ����Ϊ��ӡ��־
*/
@Order(1)
@Aspect
@Component
public class LoggingAspect {
	
	@Pointcut("execution(public int com.lin.aop.ArithmeticCalculatorImpl.*(int , int ))")
	public void joinPoinExpression() {}

	@Before("joinPoinExpression()")
	// �����÷����Ǹ�ǰ�÷��� ��Ŀ�귽��ǰִ�� *������������з�������Ч
	public void beforeMethod(JoinPoint joinPoint) {
		// joinpoint��ȡ����
		String methodName = joinPoint.getSignature().getName();
		List<Object> asList = Arrays.asList(joinPoint.getArgs());
		System.out.println("ǰ��֪ͨ" + "��������" + methodName + "������Ĳ�����" + asList);
	}

	@After("joinPoinExpression()")
	public void afterMethod(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().getName();
		List<Object> asList = Arrays.asList(joinPoint.getArgs());
		System.out.println("����֪ͨ");
	}

	@AfterReturning(value = "joinPoinExpression()", returning = "result")
	public void afterReturn(JoinPoint joinPoint, Object result) {
		System.out.println("����֪ͨ ��������ִ�к�ִ��" + "����ִ�еĽ����" + result);
	}

	@AfterThrowing(value = "joinPoinExpression()", throwing = "e")
	public void afterThrowing(JoinPoint joinPoint, Exception e) {
		System.out.println("�쳣֪ͨ " + "���ֵ��쳣��" + e);
	}

}
