package com.lin.annotation.Controller;
/*
*@author linone
*/

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.lin.annotation.Service.Service;

@org.springframework.stereotype.Controller
//��ʶ��ʾ��
public class Controller {

	
	@Autowired
	//��Ҫ��������Bean Ҫ�������ʶ Ҳ���Է���Set������
	private Service service;
	public void setService(@Qualifier("linzejia2")Service service) {
		this.service = service;
	}
	
	public void saveC() {
		service.save();
	}
 	
}
