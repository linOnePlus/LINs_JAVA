package com.lin.linkedhashset;

/*
 * hashset������ʵ��  ���Ա�֤Ԫ��Ψһ  �����Ա�֤��ȡ˳��(��ô����ôȡ)
 * ��ɾ�� ��ѯ��
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
