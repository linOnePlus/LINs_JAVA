package stringBuffer;

public class stringBufferDelete {

	public static void main(String[] args) {
 StringBuffer sb ;
 sb=new StringBuffer("linzejia777");
 sb.deleteCharAt(8);//ɾ��ָ��λ�õ����������ҷ��ر���
 System.out.println(sb);
 sb.delete(8,sb.length());//��8һֱɾ�����
 System.out.println(sb);
	}
    
}
