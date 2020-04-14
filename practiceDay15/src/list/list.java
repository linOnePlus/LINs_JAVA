package list;

import java.util.ArrayList;
import java.util.List;

public class list {

	public static void main(String[] args) {

		List a = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			a.add(i);//LISt特有方法1 在尾部加元素
		}
		a.add(10, 26);//在指定索引处增加元素
		int v = (int) a.get(2);// GET方法 传索引 找值 返回OBJECT类对象 向下强转 再自动拆箱
		System.out.println(v);
		System.out.println(a.get(10));
		Integer set = (Integer) a.set(10, 55);//修改制定索引的元素
		System.out.println(set);
		
		

	}

}
