package �򵥹���ģʽ;

public abstract class Animal {
     public abstract void eat();
}
class dog extends Animal{

	@Override
	public void eat() {
	System.out.println("dog eat");
	}
	
}
class cat extends Animal{

	@Override
	public void eat() {
	System.out.println("cat eat");
	}
}
class tiger extends Animal{

	@Override
	public void eat() {
	System.out.println("tiger eat");
	}
	
}