package stringBuffer;

public class stringBufferAdd {

	public static void main(String[] args) {
		
	 append1();
     insert1();
      }

	private static void insert1() {
		StringBuffer sb2= new  StringBuffer();
		 sb2.insert(0, "linzejianiubi");//��ָ���������ָ��Ԫ��
		 System.out.println(sb2);
	}

	private static void append1() {
		//append���� ����ֵStringBuffer���� 
		  StringBuffer sb = new StringBuffer("lin");
		  System.out.println(sb.capacity());//��ʾ�ַ����������ĳ�ʼ����
		  StringBuffer sb2 =sb.append(666);
		  StringBuffer sb3 =sb.append("linzejia");
		  System.out.println(sb);//append�������ᴴ���¶���ֻ���ڲ����򻺳�������ַ�
	}

}
