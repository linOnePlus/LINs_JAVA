package practiceDay8;

public class extendpractice {

	public static void main(String[] args) {
	cat c1=new cat();
	c1.show();

	}

}
class cat extends animal{//方法同名会执行自己类中的同名方法
	public static void show(){
		System.out.println("方法同名会出现什么情况");
	}
}
class animal{
	public static void show(){
		System.out.println("方法同名会出现什么情况ne");
	}
}