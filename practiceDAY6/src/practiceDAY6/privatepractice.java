package practiceDAY6;

public class privatepractice {

	public static void main(String[] args) {
		people lin=new people();
		lin.setName("林泽佳");
		System.out.println(lin.getName());//输出getname的结果值。
		lin.go();

	}


}
class people{
   private String name ;
   private int age;
   public void setName(String name){//林泽佳赋值给形式参数STRING NAME ；
	   this.name=name;//name赋值给成员变量NAME；THIS 表示这个对象的地址值，相当于lin.name
   }
   public String  getName(){
	   return this.name;
   }
   
  public void go(){
	  System.out.println(name+age);//输出lin对象里的属性NAME 和AGE。
  }
}