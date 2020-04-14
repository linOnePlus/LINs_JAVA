package practice;

public class Overload {

	public static void main(String[] args) {
		boolean b1 = isEquals(10,11);
		boolean b2 = isEquals(10.3,20.1);
System.out.println(b1);
System.out.println(b2);
	}
     public static boolean isEquals(int a, int b){
    	 return a == b;
     }
    public static boolean isEquals(double a, double  b){
    	 
    	 return a == b;
     }
  }
