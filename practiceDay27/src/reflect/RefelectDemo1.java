package reflect;

import com.lin.bean.People;
//��ȡ�ֽ�������ַ�ʽ
public class RefelectDemo1 {
  public static void main(String[] args) throws ClassNotFoundException {
	Class clazz =Class.forName("com.lin.bean.People");
   System.out.println(clazz);
   Class clazz2=People.class;
   System.out.println(clazz2);
   Class<? extends People> clazz3 = new People().getClass();
   System.out.println(clazz3);
  }
}
