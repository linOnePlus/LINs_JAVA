package stringBuffer;

public class stringBuffer {
 public static void main(String[]args) {
	  StringBuffer sb =new StringBuffer();
		System.out.print(sb.toString());
		System.out.println(sb.length());//�������ַ�����
		System.out.println(sb.capacity());//�������� Ĭ��16
	  
	 StringBuffer sb2=new  StringBuffer(20);//�в�Int �涨��������
	 System.out.println(sb2.capacity());
		
	 StringBuffer sb3 = new StringBuffer("linsjava");//�в� ��string 
	 System.out.println(sb3.length());
	 System.out.println(sb3.capacity());//����24 ԭ��������16�Կ�����������ַ�
}
	
}
