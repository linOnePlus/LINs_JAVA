package 工厂方法模式;

public class test {

	public static void main(String[] args) {
new CatFactory().createAnimal().eat();
new DogFactory().createAnimal().eat();
new TigerFactory().createAnimal().eat();

	}

}
