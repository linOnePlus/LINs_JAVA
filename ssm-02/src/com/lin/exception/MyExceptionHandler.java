package com.lin.exception;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

/*
*@author linone
*自定义异常处理器
*/
public class MyExceptionHandler implements HandlerExceptionResolver {

	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object obj,
			Exception e) {
		//obj参数：发生异常的地方   包名+类名+方法名（形参） 字符串
		String msg;
		//instanceof用来测试一个对象是否为一个类的实例，
		if (e instanceof MyException) {
			// 如果是自定义异常，读取异常信息
			msg=e.getMessage();
		}
		else {
			// 如果是运行时异常，则取错误堆栈，从堆栈中获取异常信息
			Writer out = new StringWriter();
			PrintWriter s = new PrintWriter(out);
			e.printStackTrace(s);
			msg = out.toString();
		}
		// 把错误信息发给相关人员,邮件,短信等方式
		//省略

				// 返回错误页面，给用户页面显示错误信息
				ModelAndView modelAndView = new ModelAndView();
				modelAndView.addObject("msg", msg);
				modelAndView.setViewName("error");

				return modelAndView;
	}



}
