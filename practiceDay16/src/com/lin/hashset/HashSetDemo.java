package com.lin.hashset;

import java.util.HashSet;

import com.lin.bean.student;

/*
 * hashset不能存储重复元素的原理
 * 调用类中的HASHcode 和EQUALS方法进行判断有无重复元素
 * 先判断hashCode的返回值，如果没有相同， 则存入元素
 * 如果有相同，则调用equals方法进行比较
 * 
 * */
public class HashSetDemo {

	public static void main(String[] args) {
HashSet<student> hs = new HashSet<student>();
hs .add(new student("张三", 32));
hs.add(new student("张三", 32));
for (student student : hs) {
	System.out.println(student);
}
	}

}
