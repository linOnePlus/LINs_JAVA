package 简单工厂模式;

public class test {

	public static void main(String[] args) {
SimpleFactory.createInstance("dog").eat();
SimpleFactory.createInstance("cat").eat();
SimpleFactory.createInstance("tiger").eat();
	}

}
