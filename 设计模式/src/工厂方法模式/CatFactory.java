package 工厂方法模式;

public class CatFactory implements Factroy {

	@Override
	public Animal createAnimal() {
		return new cat();
	}

}
