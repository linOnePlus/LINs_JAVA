package com.lin.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
/*
 * �����ĵڶ��ַ���
 * �Ѽ�ֵ�Է�װ��ENTRY���� 
 * ENTRYΪMAP���Ӿ�̬�ӿ�*/
public class demo2 {
public static void main(String[] args) {
	 Map<String, Integer> mp = new  HashMap<>();
	  mp.put("zhangsan", 23);
	  mp.put("lisi", 24);
	  mp.put("wangwu", 25);
	  mp.put("zaholiu", 26);
	  Set<Entry<String, Integer>> entrySet = mp.entrySet();//�Ѽ�ֵ�Է�װ�ɶ������Set������ 
	  for (Entry<String, Integer> entry : entrySet) {//������ȡÿһ��ENTRY����
		String key = entry.getKey();//getkey������ȡ��
		Integer value = entry.getValue();//getvalue()��ȡֵ
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
