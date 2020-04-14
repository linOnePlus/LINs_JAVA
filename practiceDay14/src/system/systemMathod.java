package system;

public class systemMathod {

	public static void main(String[] args) {
//		long a = System.currentTimeMillis();// 获取当前时间距离1970年1月1日的毫秒值
//		for (int i = 0; i <= 999999; i++) {
//			System.out.println(i - 1);
//		}
//		long b = System.currentTimeMillis();
//		System.out.println("运算100万次， 你的电脑所用的时间是" + (b - a) + "毫秒");
//
//		System.exit(0);// 退出JVM
//		System.out.println("sb JVM推出了");
		for (int i = 0; i <20; i++) {
			new  systemMathod(); //产生垃圾
			System.gc();//手动调用finalize方法 不多少个都给你扫掉
		}
		
		
		
	}

	@Override
	protected void finalize() throws Throwable {//finalize()方法只有在垃圾足够多的时候才会自动调用  2000000000个垃圾才行
		System.out.println("垃圾被清扫了");
	}

}
