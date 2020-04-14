package practiceDay1004;

public class staticcalssincalss {

	public static void main(String[] args) {
		outer2.inner2 b= new outer2.inner2();
//		 调用静态内部类中的非静态成员方法，创建内部类的对象就行
	     System.out.println(b.add1(8, 9));

	}

}
class outer2{
	static class inner2{
		public   int add1(int a,int b){
		 return a+b;
		}
	}
    static class inner3{
    	public static int add2(int a ,int b){
    		return a+b;
    	}
    }
	}

