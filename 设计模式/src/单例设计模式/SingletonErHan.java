package 单例设计模式;
/* 单例设计模式 保证类在内存中只有一个对象，不可以创建多个对象 */
//饿汉式 时间换空间  更推荐使用
class SingletonErHan{

	private  SingletonErHan() {
		super();
	}
	private static SingletonErHan s=new SingletonErHan();
	public static SingletonErHan getInstance() {
		return s;
	}
}