package integer;

public class chaiXiang {

	 int d = 100 ;
	 Integer e =new Integer(d);//基本数据类型装箱成对象
	 
	 int f = e.intValue();//对象拆箱成基本数据类型
	 
	 Integer e2 =100;//自动装箱
	 int f2 =e2+200;//自动拆箱
}
