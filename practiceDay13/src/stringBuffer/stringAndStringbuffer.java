package stringBuffer;

public class stringAndStringbuffer {
	public static void main(String[] args) {
		String a=  new String("fucker");
		chage(a);//string�����������ݣ����ı���ֵ����������������һ��
		System.out.println(a);
		StringBuffer sb =new StringBuffer("sb");
		chage(sb);
		System.out.println(sb);
	}
	private static void chage(StringBuffer a) {
	 a.append("sss");//append���� �������ַ���ӽ����������������ַ�������
	}

	private static void chage(String a) {
		  a+="li";
	}


}
