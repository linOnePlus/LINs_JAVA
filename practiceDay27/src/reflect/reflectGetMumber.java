package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

import com.lin.bean.People;

//获取成员变量  age变量为私有的 sex没加  name public 
public class reflectGetMumber {
	public static void main(String[] args) throws Exception {
		Class<?> clazz = Class.forName("com.lin.bean.People");
		Constructor<?> constructor = clazz.getConstructor(String.class, int.class, boolean.class);
		People p = (People) constructor.newInstance("hong", 20, true);
		// 获取PUBLIC变量
		Field field = clazz.getField("name");// 这个方法只能获取PUBLIC的成员变量?
		System.out.println(field);
		field.set(p, "lin");// 获p.NAME并修改值
		System.out.println(p);
		// 获取私有的变量
		Field declaredField = clazz.getDeclaredField("age");
		declaredField.setAccessible(true);// 去除私有权限
		System.out.println(declaredField.get(p));// 打印p的age属性值
		// 获取没加修饰符的变量
		Field field2 = clazz.getDeclaredField("sex");
		field2.setAccessible(true);
		System.out.println(field2.get(p));

		/*
		 * 没加修饰符的也要用暴力反射
		 * Field field3 = clazz.getField("sex"); 
		 * System.out.println(field3.get(p));
		 */
	}
}
