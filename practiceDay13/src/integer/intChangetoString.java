package integer;

public class intChangetoString {

	public static void main(String[] args) {

//		intTostring();
		
		stringtoint();
		
		
	}

	private static void stringtoint() {
		String a1 = "202020";
		Integer b1 = 0;
		System.out.println(b1.parseInt(a1));//调用parseint
		
		Integer b2 =new Integer(a1);//构造方法
		System.out.println(b2);
	}

	private static void intTostring() {
		int  a =10;
		String b= a + " ";//stringbuffer tostring方法
		System.out.println( b);
		
		 String c= new String(); 
		 System.out.println( c.valueOf(a) +10);//调用valueof转换
		
		 Integer d1= 200;//自动装箱
		 String g =d1.toString();//调用Tostring方法
	}

}
