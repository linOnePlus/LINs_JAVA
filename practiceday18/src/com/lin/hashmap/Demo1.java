package com.lin.hashmap;

import java.util.HashMap;
import java.util.Set;

import com.lin.studentbean.Student;

/*
1�� ��Ŀ��ȫ��Сд
2�� ����ȫ��Сд
3�� ��������ĸ��д����������ɶ��������ɣ�ÿ�����ʵ�����ĸ��Ҫ��д��
4�� ������������������ĸСд����������ɶ��������ɣ�����һ��������ÿ�����ʵ�����ĸ��Ҫ��д��
5�� ������ȫ����д
*/
public class Demo1 {

public static void main(String[] args) {
HashMap<Student, Integer> hm = new HashMap<Student, Integer>();
hm.put(new Student("zhangsan", 23), 1);//�����Զ������ʱ�� ����дhashCode��equals���� ����ʵ��ȥ�ظ����� ��HashSetһ����ԭ��
hm.put(new Student("zhangsan", 23), 1);
hm.put(new Student("lisi", 24), 2);
hm.put(new Student("wangwu", 25), 3);
hm.put(new Student("zhaoliu", 26), 4);
Set<Student> keySet = hm.keySet();
for (Student student : keySet) {
	Integer integer = hm.get(student);
	System.out.println(student+" "+integer);
}
}
}
