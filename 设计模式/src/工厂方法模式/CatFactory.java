package ��������ģʽ;

public class CatFactory implements Factroy {

	@Override
	public Animal createAnimal() {
		return new cat();
	}

}
