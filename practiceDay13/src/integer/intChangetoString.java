package integer;

public class intChangetoString {

	public static void main(String[] args) {

//		intTostring();
		
		stringtoint();
		
		
	}

	private static void stringtoint() {
		String a1 = "202020";
		Integer b1 = 0;
		System.out.println(b1.parseInt(a1));//����parseint
		
		Integer b2 =new Integer(a1);//���췽��
		System.out.println(b2);
	}

	private static void intTostring() {
		int  a =10;
		String b= a + " ";//stringbuffer tostring����
		System.out.println( b);
		
		 String c= new String(); 
		 System.out.println( c.valueOf(a) +10);//����valueofת��
		
		 Integer d1= 200;//�Զ�װ��
		 String g =d1.toString();//����Tostring����
	}

}
