package com.lin.hashset;

import java.util.HashSet;

import com.lin.bean.student;

/*
 * hashset���ܴ洢�ظ�Ԫ�ص�ԭ��
 * �������е�HASHcode ��EQUALS���������ж������ظ�Ԫ��
 * ���ж�hashCode�ķ���ֵ�����û����ͬ�� �����Ԫ��
 * �������ͬ�������equals�������бȽ�
 * 
 * */
public class HashSetDemo {

	public static void main(String[] args) {
HashSet<student> hs = new HashSet<student>();
hs .add(new student("����", 32));
hs.add(new student("����", 32));
for (student student : hs) {
	System.out.println(student);
}
	}

}
