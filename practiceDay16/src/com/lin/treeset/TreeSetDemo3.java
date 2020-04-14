package com.lin.treeset;

import java.util.TreeSet;

/*
 * TreeSet 存自定义对象
 * 之实现Comparable接口重写ComparaTo()方法
 * */
public class TreeSetDemo3 {
	public static void main(String[] args) {
		TreeSet<People> ts1 = new TreeSet<People>();
		ts1.add(new People(10, "lee"));
		ts1.add(new People(20, "lin"));
		ts1.add(new People(18, "hong"));
		for (People people : ts1) {
			System.out.println(people);
		}
	}
}

class People implements Comparable<People> {
	private int age;
	private String name;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public People(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "People [age=" + age + ", name=" + name + "]";
	}
//按照姓名长度作为首要比较条件，如果相同 则比较年龄，年龄相同 则比较姓名
	@Override
	public int compareTo(People o) {
		return o.name.length()-this.name.length()==0?o.age-this.age==0?o.name.compareTo(this.name):o.age-this.age:o.name.length()-this.name.length();
	}

	/*
	 * //按照年龄排序， 若年龄一样 则按照姓名排序
	 * 
	 * @Override public int compareTo(People p) { return
	 * this.age-p.age==0?this.name.compareTo(p.name):this.age-p.age; }
	 */

}
