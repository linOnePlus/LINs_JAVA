package 工厂方法模式;



public class DogFactory implements Factroy {

	@Override
	public Animal createAnimal() {
		return new dog();
	}

}
