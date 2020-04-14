package com.lin.linkedhashmap;
import java.util.LinkedHashMap;
import java.util.Set;

import com.lin.studentbean.*;
/*
 * linkedhashmap
 * 不仅能去重复（根据键值）
 * 还能保证顺序 怎么存怎么取  类似LINKEDhashSet*/
public class Demo1 {
public static void main(String[] args) {
	LinkedHashMap<Student,Integer> lhm = new  LinkedHashMap<Student, Integer>();
	lhm.put(new Student("zhangsan", 23), 1);
	lhm.put(new Student("zhangsan", 23), 1);//若存自定义对象时候 不重写hashCode和equals方法 不能实现去重复功能 和HashSet一样的原理
	lhm.put(new Student("lisi", 24), 2);
	lhm.put(new Student("wangwu", 25), 3);
	lhm.put(new Student("zhaoliu", 26), 4);
	Set<Student> keySet = lhm.keySet();
	for (Student student : keySet) {
		Integer integer = lhm.get(student);
		System.out.println(student+" "+integer);
	}
}
}
