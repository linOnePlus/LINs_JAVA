package stringBufferText;
/*���[1,2,3]*/
public class txst1 {
public static void main(String[] args) {
int  [] arr ={1,2,3};	
System.out.println(method1(arr));

}
public static StringBuffer method1(int []arr){
	StringBuffer sb= new StringBuffer();
	sb.append("[");
	for (int i = 0; i < arr.length; i++) {
	if (i==arr.length-1) {
		sb.append(arr[i]).append(']');//�����ַ���������+������ ��ʡ�ܶ��ڴ�ռ�
	} else {
     sb.append(arr[i]).append(',');
	}
		}
	
	 return sb;
}


}

