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
		};// ����Inter������� ���������ñ���SHOW������
	}
}
