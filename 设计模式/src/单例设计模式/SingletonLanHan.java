package 单例设计模式;
/* 懒汉式 空间换时间
 * 先不创建对象 调用时才创建对象 
 * 多线程调用时 可能会造成创建多个对象的情况 */

class SingletonLanHan{
	private SingletonLanHan () {	}//私有构造方法， 不然其他类创建该类对象
	private  static SingletonLanHan s; //必须是静态的，否则静态方法访问不到
	public static SingletonLanHan getInstance() {
		if(s==null)
			s=new SingletonLanHan();
		return s ;
	}
}