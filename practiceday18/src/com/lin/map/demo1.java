package com.lin.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class demo1 {
public static void main(String[] args) {
  Map<String, Integer> mp = new  HashMap<>();
  mp.put("zhangsan", 23);
  mp.put("lisi", 24);
  mp.put("wangwu", 25);
  mp.put("zaholiu", 26);
  
  int size = mp.size();
  
  boolean containsKey = mp.containsKey("zhangsan");
  boolean containsValue = mp.containsValue(22);
  boolean empty = mp.isEmpty();
  
  Integer integer = mp.get("zhangsan");//get()���ݼ���ȡֵ
  Set<String> keySet = mp.keySet();//��ȡ������
  for (String string : keySet) {
	Integer integer2 = mp.get(string);//���ݼ���ȡֵ
	System.out.println(string+" "+integer2);
}
  Collection<Integer> values = mp.values();//��ȡֵ�ļ���
 for (Integer integer2 : values) {
	System.out.println(integer2);
}
}
}
