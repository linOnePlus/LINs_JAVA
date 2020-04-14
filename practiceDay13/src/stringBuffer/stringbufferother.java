package stringBuffer;

public class stringbufferother {

	public static void main(String[] args) {
StringBuffer sb = new StringBuffer();
sb.append("ssssb").append(555);

System.out.println(sb+" "+sb.length());
System.out.println(sb.replace(0, 7, "fucker"));//替换功能返回值是STB
System.out.println(sb.reverse());//翻转功能 返回值是STB
String a=sb.substring(1);
System.out.println(a);


	}

}
