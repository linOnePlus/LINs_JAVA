package com.lin.treeset;

import java.math.BigDecimal;
import java.util.TreeSet;

/*
 * treeset���򡢱�֤Ψһ��ԭ��
 * ���ǿ�ʵ��Comarpabale�ӿ� ����comparTo()�������бȽ�
 *  HashSet��TreeSet��LinkedHashSet֮�������HashSetֻȥ�أ�TreeSetȥ�ز�����LinkedHashSetȥ�ز���������˳��
 * */
public class TreeSetDemo2 {

	public static void main(String[] args) {
		/*
		 * BigDecimal��BigIneger�Լ�������ֵ�Ͷ�Ӧ��װ�ࣺ�����Ƕ�Ӧ����ֵ�Ĵ�С���бȽϡ� Character�����ַ���UNICODEֵ���бȽϡ�
		 * Boolean��true��Ӧ�İ�װ��ʵ������false��Ӧ�İ�װ��ʵ����
		 * String�����ַ������ַ���UNICODEֵ���бȽϡ�
		 * Date��Time�������ʱ�䡢���ڱ�ǰ���ʱ�䡢���ڴ�
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


