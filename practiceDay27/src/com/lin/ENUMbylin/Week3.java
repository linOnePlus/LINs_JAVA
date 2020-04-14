package com.lin.ENUMbylin;
package com.lin.�Լ�����ENUM;
//ö����֮ �������г��󷽷�ʱ�� ��ô���� 
public abstract class Week3 {
	public static final Week3 MON =new Week3() {

		@Override
		public void show() {
			System.out.println("����һ");
		}
		
	};//�������ڲ��ഴ����ʵ�����������
	public static final Week3 TUE =new Week3() {

		@Override
		public void show() {
			System.out.println("���ڶ�");
		}};
	public static final Week3 WED =new Week3(){

		@Override
		public void show() {
			System.out.println("������");
		}};
	private Week3() {}
	
	public abstract void show();//���󷽷�û�з������
}
