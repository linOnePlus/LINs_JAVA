package com.lin.hashmap;

import java.util.HashMap;
import java.util.Set;

import com.lin.studentbean.Student;

/*
1、 项目名全部小写
2、 包名全部小写
3、 类名首字母大写，如果类名由多个单词组成，每个单词的首字母都要大写。
4、 变量名、方法名首字母小写，如果名称由多个单词组成，除第一个单词外每个单词的首字母都要大写。
5、 常量名全部大写
*/
public class Demo1 {

public static void main(String[] args) {
HashMap<Student, Integer> hm = new HashMap<Student, Integer>();
hm.put(new Student("zhangsan", 23), 1);//若存自定义对象时候 不重写hashCode和equals方法 不能实现去重复功能 和HashSet一样的原理
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
