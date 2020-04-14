package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class collectionBianLi {

	public static void main(String[] args) {
		Collection c = new ArrayList();
		toarray(c);
		Iterator a= c.iterator();//获取迭代器 c.iterator返回的是iterator的子类ITR对象
		while (a.hasNext()) {//调用ITR中的方法
			System.out.print(a.next());
		}
	}

	private static void toarray(Collection c) {
		c.add("zifuhcuan");
		c.add(new Student());
		c.add(new Student(" ",23));
		c.add(new Student("ss",22));
		Object [] arr =c.toArray();//返回值类型Object [] arr   collection集合的toarray()方法
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
