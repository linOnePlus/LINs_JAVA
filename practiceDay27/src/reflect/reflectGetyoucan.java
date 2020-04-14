package reflect;

import java.lang.reflect.Constructor;

import com.lin.bean.People;

public class reflectGetyoucan {

	public static void main(String[] args) {
try {
	Class<?> clazz = Class.forName("com.lin.bean.People");
	Constructor<?> c = clazz.getConstructor(String.class,int.class,boolean.class);
	System.out.println(c.newInstance("lin",23,false));
	People p =(People)c.newInstance("lin",23,false);
	System.out.println(p);
} catch (Exception e) {
	e.printStackTrace();
}
	}

}
