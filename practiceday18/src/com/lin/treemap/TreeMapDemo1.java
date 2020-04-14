package com.lin.treemap;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

import com.lin.studentbean.Student;

/*
 * ��ֵ�����ظ�
 * ��������
 * ����TreeSet
 * 
 * ʵ���������ַ���
 * 1.ʵ��Comparable�ӿ� ��дComparaTo()
 * 2.���вι��촫Comprartor������� ��д compare()
 * */
public class TreeMapDemo1 {

	public static void main(String[] args) {
  TreeMap<Person, Integer> tm = new TreeMap<Person, Integer>(new Comparator<Person>() {

	@Override
	public int compare(Person o1, Person o2) {
		return o1.getAge()-o2.getAge();
	}
});
  tm.put(new Person("zhangsan", 23), 1);
  tm.put(new Person("lisi", 24), 2);
  tm.put(new Person("wangwu", 25), 3);
  tm.put(new Person("zhaoliu", 26), 4);
  Set<Person> keySet = tm.keySet();
  for (Person person : keySet) {
	  Integer integer = tm.get(person);
	  System.out.println("key="+person+"values="+integer);
}
	}

}
class Person extends Student implements Comparable<Person>{//�Զ�������Ҫʵ��Comparable�ӿ�

	public Person(String name, int age) {
		super(name, age);
	}
//�����������Ƚ�  ������ͬ ������������Ƚ�
@Override
public int compareTo(Person o) {
	return this.getAge()-o.getAge()==0?this.getName().compareTo(o.getName()):this.getAge()-o.getAge();
}
    
}
