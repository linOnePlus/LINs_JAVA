package com.lin.controller;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lin.pojo.item;

/*
*@author linone
*/
@Controller
public class ItemController {

	@RequestMapping("itemList")
	public ModelAndView itemList() {
		ModelAndView mav = new  ModelAndView();
		//mav.setViewName("WEB-INF/jsp/itemList.jsp");
		mav.setViewName("itemList");
		List<item> list = Arrays.asList(new item(1,"�ɿ�", 200, new Date(22222), "good"),new item(2,"fuck", 500, new Date(5000), "ak47"));
		mav.addObject("itemList", list);
		return mav;
	}
}
