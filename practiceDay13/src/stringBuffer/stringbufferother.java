package stringBuffer;

public class stringbufferother {

	public static void main(String[] args) {
StringBuffer sb = new StringBuffer();
sb.append("ssssb").append(555);

System.out.println(sb+" "+sb.length());
System.out.println(sb.replace(0, 7, "fucker"));//�滻���ܷ���ֵ��STB
System.out.println(sb.reverse());//��ת���� ����ֵ��STB
String a=sb.substring(1);
System.out.println(a);


	}

}
