package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class collectionBianLi {

	public static void main(String[] args) {
		Collection c = new ArrayList();
		toarray(c);
		Iterator a= c.iterator();//��ȡ������ c.iterator���ص���iterator������ITR����
		while (a.hasNext()) {//����ITR�еķ���
			System.out.print(a.next());
		}
	}

	private static void toarray(Collection c) {
		c.add("zifuhcuan");
		c.add(new Student());
		c.add(new Student(" ",23));
		c.add(new Student("ss",22));
		Object [] arr =c.toArray();//����ֵ����Object [] arr   collection���ϵ�toarray()����
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
