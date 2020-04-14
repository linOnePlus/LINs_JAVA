package 工厂方法模式;

public class TigerFactory implements  Factroy{

	@Override
	public Animal createAnimal() {
		return new tiger();
	}

}
