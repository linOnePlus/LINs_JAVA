package com.lin.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * set���ϴ�ȡ˳��һ��  ���� ������ ���ܴ��ظ�
 * */
public class set {

	public static void main(String[] args) {

		Set<Object> set = new  HashSet<Object>();
		set.add(23);
		set.add(33);
		set.add(44);
		for (Object object : set) {
			System.out.println(object);
		}
		
		HashSet<Integer> hashset = new  HashSet<Integer>();
		hashset.add(22);
		hashset.add(33);
		hashset.add(334);
		Iterator<Integer> iterator = hashset.iterator();
		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
			
		}
	}

}
