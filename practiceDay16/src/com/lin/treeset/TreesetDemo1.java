package com.lin.treeset;
/*
 * ��֤Ԫ��Ψһ 
 * ���ܸ�Ԫ������
 * */

import java.util.TreeSet;

public class TreesetDemo1 {
public static void main(String[] args) {
	TreeSet<Integer> ts = new  TreeSet<Integer>();
	ts.add(11);
	ts.add(22);
	ts.add(33);
	ts.add(10);
	ts.add(31);
	for (Integer integer : ts) {
		System.out.println(integer);
	}
}

}
