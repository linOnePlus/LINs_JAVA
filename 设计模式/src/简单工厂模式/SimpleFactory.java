package 简单工厂模式;

/*又叫静态工厂方法模式，定义一个具体的工厂类负责创建类的实例
 * 弊端 如果要新增对象，就要不断增加修改工厂类*/
public class SimpleFactory {
	private SimpleFactory() {
	}

	public static Animal createInstance(String name) {
		switch(name) {
		case "dog":
			return new dog();
			
		case "cat":
		return new cat();
		
		case "tiger":
		return new tiger();
		default:
			System.out.println("u are wrong");
      return null;	
	}
}
}