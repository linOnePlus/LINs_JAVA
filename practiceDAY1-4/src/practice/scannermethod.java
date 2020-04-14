package practice;
import java.util.Scanner;
public class scannermethod {
//two number bigger.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please input two number ");
		int x = sc.nextInt();
		int y = sc.nextInt();
	    int big = getMax(x,y);
		System.out.println("bigger one is"+big);
		boolean same = isEquals(x,y);
		System.out.println("two number same?ture or false? the result is "+ same);
	   	System.out.println("please input a number between 1-9");
	   	byte row = sc.nextByte();
	    sc.close();
		for99(row);
	}
     public static int getMax(int a,int b){
    	 int big;
    	 if(a>b){
    		big = a;
    	 }else {
    		 big = b;
    	 }
    	 return big;//Ö±½Óreturn a > b ? a:b;
     }
     
     public static boolean isEquals(int a,int b){
    	 return a == b ? true : false;
     }
     
     public static void for99(byte a){
    	 for(int i = 1;i <= a ; i++){
    		 for(int j = 1;j <= i ;j ++){
    			 System.out.print(j+"*"+i+"="+i*j+"\t");
    		 }
    			 System.out.println();
    		 
    	 }
     }
}
