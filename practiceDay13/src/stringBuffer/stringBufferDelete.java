package stringBuffer;

public class stringBufferDelete {

	public static void main(String[] args) {
 StringBuffer sb ;
 sb=new StringBuffer("linzejia777");
 sb.deleteCharAt(8);//删除指定位置的索引。并且返回本身
 System.out.println(sb);
 sb.delete(8,sb.length());//从8一直删到最后
 System.out.println(sb);
	}
    
}
