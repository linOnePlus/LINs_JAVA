package regex;
//��ȡ�ֻ�����
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class pattenAndMatcher {

	public static void main(String[] args) {
String aim ="15999549759skdmskdicnx13590309050safdnujcnjkcncuhu";
Pattern p  =Pattern.compile("1[35789]\\d{9}");//����compile��������������������
Matcher m = p.matcher(aim);//����matcher��������Ŀ���ַ���������
while (m.find()) {//mather���find���� ����ֵBOOLEAN 
	System.out.println(m.group());//������� �͵���group�������
	
}
	}

}
