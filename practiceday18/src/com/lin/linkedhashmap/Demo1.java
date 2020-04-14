package com.lin.linkedhashmap;
import java.util.LinkedHashMap;
import java.util.Set;

import com.lin.studentbean.*;
/*
 * linkedhashmap
 * ������ȥ�ظ������ݼ�ֵ��
 * ���ܱ�֤˳�� ��ô����ôȡ  ����LINKEDhashSet*/
public class Demo1 {
public static void main(String[] args) {
	LinkedHashMap<Student,Integer> lhm = new  LinkedHashMap<Student, Integer>();
	lhm.put(new Student("zhangsan", 23), 1);
	lhm.put(new Student("zhangsan", 23), 1);//�����Զ������ʱ�� ����дhashCode��equals���� ����ʵ��ȥ�ظ����� ��HashSetһ����ԭ��
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
