package noNameInnerClass;

public class useNoNameInnerClass {
//如何调用PersonDemo 中 method方法
	public static void main(String[] args) {
    PersonDemo pd =new PersonDemo();
    pd.method(new Person(){
    	public void show(){
    		System.out.println("调用成功");
    	}
    }//上面整段内容new Peroson(){}代表抽象类Person的子类对象;
    );
    // 直接传new person ();不行抽象类不能创建对象，只能通过传子类对象 或者匿名内部类；
		
		
	}

}
abstract class Person{
	public abstract void show();
}

class PersonDemo{
	public void method(Person p){
		p.show();
	}
}
