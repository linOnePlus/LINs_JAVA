package com.lin.treeset;

import java.math.BigDecimal;
import java.util.TreeSet;

/*
 * treeset排序、保证唯一性原理
 * 都是靠实现Comarpabale接口 调用comparTo()方法进行比较
 *  HashSet，TreeSet，LinkedHashSet之间的区别：HashSet只去重，TreeSet去重并排序，LinkedHashSet去重并保留插入顺序
 * */
public class TreeSetDemo2 {

	public static void main(String[] args) {
		/*
		 * BigDecimal、BigIneger以及所有数值型对应包装类：按它们对应的数值的大小进行比较。 Character：按字符的UNICODE值进行比较。
		 * Boolean：true对应的包装类实例大于false对应的包装类实例。
		 * String：按字符串中字符的UNICODE值进行比较。
		 * Date、Time：后面的时间、日期比前面的时间、日期大。
		 */
		TreeSet<BigDecimal> ts1 = new TreeSet<BigDecimal>();
		ts1.add(new BigDecimal(10));
		ts1.add(new BigDecimal(20));
		ts1.add(new BigDecimal(30));

		 for (BigDecimal bigDecimal : ts1) {
			System.out.println(bigDecimal);
		}
		 TreeSet<Boolean> ts2 = new  TreeSet<Boolean>();
		 ts2.add(false);
		 ts2.add(true);
		 for (Boolean boolean1 : ts2) {
			System.out.println(boolean1);
		}
		 
	}


	}


