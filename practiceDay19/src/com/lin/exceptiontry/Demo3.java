package com.lin.exceptiontry;
//finally������RETURNִ����Ҳ��ִ��
public class Demo3 {
public static void main(String[] args)  {
	int test = people.test();
	System.out.println(test);
	
}
}
class  people{
	public static int test(){
		try {
			System.out.println(10/0);
			return 0;
		} catch (Exception e) {
			return 1;
		}finally {
			System.out.println("�һ���ִ����");
		}
		
	}
}
