package com.lin.treeset;

import java.util.Comparator;
import java.util.TreeSet;

/*
 * TreeSetԭ��֮�Ƚ�������
 * ����TreeSet���ϵ�ʱ����һ��Comparator�����������Ϊ�Ƚ��� 
 * ������дcompare����
 * ���ӣ�Ҫ��String�����ַ����ȱȽ�
 * */
public class TreeSetDemo4 {

	public static void main(String[] args) {
TreeSet<String> ts2= new TreeSet<>(new Comparator<String>() {

	@Override
	public int compare(String o1, String o2) {
		return o1.length()-o2.length()==0?o1.compareTo(o2):o1.length()-o2.length();
	}

});
ts2.add("l");
ts2.add("lzsss");
ts2.add("ljx");
for (String string : ts2) {
	System.out.println(string);
}
	}

}
