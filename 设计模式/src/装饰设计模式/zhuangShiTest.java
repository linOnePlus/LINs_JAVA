package 装饰设计模式;



public class zhuangShiTest {

	public static void main(String[] args) {

SuperStudent ss =new SuperStudent(new Student());
ss.code();
	}

}
