package system;

public class systemMathod {

	public static void main(String[] args) {
//		long a = System.currentTimeMillis();// ��ȡ��ǰʱ�����1970��1��1�յĺ���ֵ
//		for (int i = 0; i <= 999999; i++) {
//			System.out.println(i - 1);
//		}
//		long b = System.currentTimeMillis();
//		System.out.println("����100��Σ� ��ĵ������õ�ʱ����" + (b - a) + "����");
//
//		System.exit(0);// �˳�JVM
//		System.out.println("sb JVM�Ƴ���");
		for (int i = 0; i <20; i++) {
			new  systemMathod(); //��������
			System.gc();//�ֶ�����finalize���� �����ٸ�������ɨ��
		}
		
		
		
	}

	@Override
	protected void finalize() throws Throwable {//finalize()����ֻ���������㹻���ʱ��Ż��Զ�����  2000000000����������
		System.out.println("��������ɨ��");
	}

}
