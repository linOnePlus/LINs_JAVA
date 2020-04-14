package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

import com.lin.bean.People;

//��ȡ��Ա����  age����Ϊ˽�е� sexû��  name public 
public class reflectGetMumber {
	public static void main(String[] args) throws Exception {
		Class<?> clazz = Class.forName("com.lin.bean.People");
		Constructor<?> constructor = clazz.getConstructor(String.class, int.class, boolean.class);
		People p = (People) constructor.newInstance("hong", 20, true);
		// ��ȡPUBLIC����
		Field field = clazz.getField("name");// �������ֻ�ܻ�ȡPUBLIC�ĳ�Ա����?
		System.out.println(field);
		field.set(p, "lin");// ��p.NAME���޸�ֵ
		System.out.println(p);
		// ��ȡ˽�еı���
		Field declaredField = clazz.getDeclaredField("age");
		declaredField.setAccessible(true);// ȥ��˽��Ȩ��
		System.out.println(declaredField.get(p));// ��ӡp��age����ֵ
		// ��ȡû�����η��ı���
		Field field2 = clazz.getDeclaredField("sex");
		field2.setAccessible(true);
		System.out.println(field2.get(p));

		/*
		 * û�����η���ҲҪ�ñ�������
		 * Field field3 = clazz.getField("sex"); 
		 * System.out.println(field3.get(p));
		 */
	}
}
