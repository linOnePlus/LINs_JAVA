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
*定义切面 先把切面放进ioc容器里
* 功能为打印日志
*/
@Order(1)
@Aspect
@Component
public class LoggingAspect {
	
	@Pointcut("execution(public int com.lin.aop.ArithmeticCalculatorImpl.*(int , int ))")
	public void joinPoinExpression() {}

	@Before("joinPoinExpression()")
	// 声明该方法是个前置方法 在目标方法前执行 *代表该类下所有方法都有效
	public void beforeMethod(JoinPoint joinPoint) {
		// joinpoint获取参数
		String methodName = joinPoint.getSignature().getName();
		List<Object> asList = Arrays.asList(joinPoint.getArgs());
		System.out.println("前置通知" + "方法名是" + methodName + "方法里的参数是" + asList);
	}

	@After("joinPoinExpression()")
	public void afterMethod(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().getName();
		List<Object> asList = Arrays.asList(joinPoint.getArgs());
		System.out.println("后置通知");
	}

	@AfterReturning(value = "joinPoinExpression()", returning = "result")
	public void afterReturn(JoinPoint joinPoint, Object result) {
		System.out.println("返回通知 方法正常执行后执行" + "方法执行的结果是" + result);
	}

	@AfterThrowing(value = "joinPoinExpression()", throwing = "e")
	public void afterThrowing(JoinPoint joinPoint, Exception e) {
		System.out.println("异常通知 " + "出现的异常是" + e);
	}

}
