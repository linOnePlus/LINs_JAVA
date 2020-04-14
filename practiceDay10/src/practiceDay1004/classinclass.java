package practiceDay1004;

public class classinclass {

	public static void main(String[] args) {
		outer.inner a=new outer(). new inner();
     /* 内部类对象调用：
                   外部类.内部类 对象名= 外部类对象.内部类对象*/
		a.method();
}
}
class outer{
	class inner{
		public void method(){
			System.out.println("stupid crazy");
		}
	}
}
	

	



