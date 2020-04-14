package com.lin.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
/*
 * 遍历的第二种方法
 * 把键值对封装成ENTRY对象 
 * ENTRY为MAP的子静态接口*/
public class demo2 {
public static void main(String[] args) {
	 Map<String, Integer> mp = new  HashMap<>();
	  mp.put("zhangsan", 23);
	  mp.put("lisi", 24);
	  mp.put("wangwu", 25);
	  mp.put("zaholiu", 26);
	  Set<Entry<String, Integer>> entrySet = mp.entrySet();//把键值对封装成对象存在Set集合中 
	  for (Entry<String, Integer> entry : entrySet) {//遍历获取每一个ENTRY对象
		String key = entry.getKey();//getkey（）获取键
		Integer value = entry.getValue();//getvalue()获取值
		System.out.println(key+" "+value);
		Iterator<Entry<String, Integer>> iterator = entrySet.iterator();
		while (iterator.hasNext()) {
			Entry<String, Integer> next = iterator.next();
			String key2 = next.getKey();
			Integer value2 = next.getValue();
			System.out.println(key2+" "+value2);
		}
		
	}
	  
}
}
