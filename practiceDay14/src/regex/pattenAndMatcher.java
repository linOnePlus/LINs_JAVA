package regex;
//获取手机号码
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class pattenAndMatcher {

	public static void main(String[] args) {
String aim ="15999549759skdmskdicnx13590309050safdnujcnjkcncuhu";
Pattern p  =Pattern.compile("1[35789]\\d{9}");//调用compile方法传正则编译进编译器
Matcher m = p.matcher(aim);//调用matcher方法，把目标字符串传进来
while (m.find()) {//mather里的find方法 返回值BOOLEAN 
	System.out.println(m.group());//如果发现 就调用group方法输出
	
}
	}

}
