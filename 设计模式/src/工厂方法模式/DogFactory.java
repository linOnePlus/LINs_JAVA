package ��������ģʽ;



public class DogFactory implements Factroy {

	@Override
	public Animal createAnimal() {
		return new dog();
	}

}
