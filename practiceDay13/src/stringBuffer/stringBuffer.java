package stringBuffer;

public class stringBuffer {
 public static void main(String[]args) {
	  StringBuffer sb =new StringBuffer();
		System.out.print(sb.toString());
		System.out.println(sb.length());//容器中字符个数
		System.out.println(sb.capacity());//容器容量 默认16
	  
	 StringBuffer sb2=new  StringBuffer(20);//有参Int 规定容器容量
	 System.out.println(sb2.capacity());
		
	 StringBuffer sb3 = new StringBuffer("linsjava");//有参 传string 
	 System.out.println(sb3.length());
	 System.out.println(sb3.capacity());//长度24 原来缓冲区16仍可以用于添加字符
}
	
}
