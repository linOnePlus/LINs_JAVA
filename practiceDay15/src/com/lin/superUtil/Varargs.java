package com.lin.superUtil;

public class Varargs {
	public static void main(String[] args) {
int [] arr = {22,11,33,44};
int max = getMax(arr);//���Դ�������
System.out.println(max);
reload(1);
	}

	// �����ɸ�����������ֵ �� ��û�������򷵻�int��Сֵ
	public static int getMax(int... items) {
		int max = Integer.MIN_VALUE;
		for (int i : items) {
			max = i > max ? i : max;
		}
		return max;
	}
	// ���ر�number������ĸ���
   public static int  getCount(int num , int...items) { //��Ҫ���̶������Ϳɱ����ʱ�� �ɱ����һ��Ҫ�������
	   int count = 0;
	   for (int i : items) {
		if (i>num) {
			count++;
		}
	}
	   return count;
   }
   public static void reload(int...items) {//����ʱ  ����ƥ��̶���������һ����
	   System.out.println(1);
   }
   public static void reload(int a ) {
	   System.out.println(2);
   }
}
