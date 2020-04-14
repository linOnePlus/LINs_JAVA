public class questionNoNameClass {

	public static void main(String[] args) {
		Outer.method().show();
	}

}

interface Inter {
	void show();
}

class Outer {

	public static Inter method() {
		return new Inter() {
			public void show() {
				System.out.println("Helloworld");
			}
		};// 返回Inter子类对象 子类对象调用本身SHOW方法。
	}
}
