package com.lin.linkedhashset;

/*
 * hashset的链表实现  可以保证元素唯一  还可以保证存取顺序(怎么存怎么取)
 * 增删快 查询慢
 * */
import java.util.LinkedHashSet;

public class linkedhashsetdemo1 {
	public static void main(String[] args) {
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		lhs.add(11);
		lhs.add(22);
		lhs.add(33);
		lhs.add(44);
		for (Integer integer : lhs) {
			System.out.println(integer);
		}
	}
}
