package com.lin.treemap;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

import com.lin.studentbean.Student;

/*
 * 键值不可重复
 * 可以排序
 * 类似TreeSet
 * 
 * 实现排序两种方法
 * 1.实现Comparable接口 重写ComparaTo()
 * 2.用有参构造传Comprartor子类对象 重写 compare()
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
class Person extends Student implements Comparable<Person>{//自定义类需要实现Comparable接口

	public Person(String name, int age) {
		super(name, age);
	}
//根据年龄作比较  年龄相同 则根据姓名作比较
@Override
public int compareTo(Person o) {
	return this.getAge()-o.getAge()==0?this.getName().compareTo(o.getName()):this.getAge()-o.getAge();
}
    
}
