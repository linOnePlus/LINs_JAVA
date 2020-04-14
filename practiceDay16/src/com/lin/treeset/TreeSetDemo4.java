package com.lin.treeset;

import java.util.Comparator;
import java.util.TreeSet;

/*
 * TreeSet原理之比较器排序
 * 创建TreeSet集合的时候传入一个Comparator的子类对象作为比较器 
 * 并且重写compare方法
 * 例子：要用String按照字符长度比较
 * */
public class TreeSetDemo4 {

	public static void main(String[] args) {
TreeSet<String> ts2= new TreeSet<>(new Comparator<String>() {

	@Override
	public int compare(String o1, String o2) {
		return o1.length()-o2.length()==0?o1.compareTo(o2):o1.length()-o2.length();
	}

});
ts2.add("l");
ts2.add("lzsss");
ts2.add("ljx");
for (String string : ts2) {
	System.out.println(string);
}
	}

}
