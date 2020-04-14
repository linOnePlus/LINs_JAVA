package stringBuffer;

public class stringBufferAdd {

	public static void main(String[] args) {
		
	 append1();
     insert1();
      }

	private static void insert1() {
		StringBuffer sb2= new  StringBuffer();
		 sb2.insert(0, "linzejianiubi");//在指定索引添加指定元素
		 System.out.println(sb2);
	}

	private static void append1() {
		//append方法 返回值StringBuffer类型 
		  StringBuffer sb = new StringBuffer("lin");
		  System.out.println(sb.capacity());//显示字符串缓冲区的初始长度
		  StringBuffer sb2 =sb.append(666);
		  StringBuffer sb3 =sb.append("linzejia");
		  System.out.println(sb);//append方法不会创建新对象，只是在不断向缓冲区添加字符
	}

}
