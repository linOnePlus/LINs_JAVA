package com.lin.annotation.Controller;
/*
*@author linone
*/

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.lin.annotation.Service.Service;

@org.springframework.stereotype.Controller
//标识显示层
public class Controller {

	
	@Autowired
	//若要调用其他Bean 要用这个标识 也可以放在Set方法上
	private Service service;
	public void setService(@Qualifier("linzejia2")Service service) {
		this.service = service;
	}
	
	public void saveC() {
		service.save();
	}
 	
}
