package practiceDay9;

public class polymorphic {

	public static void main(String[] args) {
		employee s=new weber("",1);
		s.eat();

	}

}
class employee{
	String name;
	int age;
	public employee(){
		System.out.println("�ղι���");
	}
	
	public employee(String name,int  age){
		System.out.println("�вι���");
		
	}
  public void eat(){
	  System.out.println("chifan");
  }
}

class  weber extends employee{
 public weber( String name,int age){
	super(name,age);//Ϊʲô����
 }
  public void eat(){
	  System.out.println("weberchifan");
  }
  public void kaifa(){
	System.out.println("webkaifa");
}
}
