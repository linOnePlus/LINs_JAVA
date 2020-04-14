package stringBuffer;

public class stringAndStringbuffer {
	public static void main(String[] args) {
		String a=  new String("fucker");
		chage(a);//string当做参数传递，不改变其值，跟基本数据类型一样
		System.out.println(a);
		StringBuffer sb =new StringBuffer("sb");
		chage(sb);
		System.out.println(sb);
	}
	private static void chage(StringBuffer a) {
	 a.append("sss");//append方法 把任意字符添加进缓冲区，并返回字符串本身
	}

	private static void chage(String a) {
		  a+="li";
	}


}
