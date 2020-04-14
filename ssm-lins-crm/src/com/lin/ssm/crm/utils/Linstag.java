package com.lin.ssm.crm.utils;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

/*
*@author linone
*/
public class Linstag extends TagSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public int doStartTag() throws JspException {
		JspWriter writer = super.pageContext.getOut();
		try {
			writer.print("<h1>我的自定义标签</h1>");
			writer.print("看看厉不厉害");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return super.doStartTag();
	}
}
