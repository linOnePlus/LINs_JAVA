package practice;

public class forfor {

	public static void main(String[] args) {
	 for(int i = 1;i <= 5;i++){
		 for(int j = 1;j <= i;j++){
			 System.out.print("*");
		 }
		System.out.println();
	 }
   System.out.println("================================================");
	 for(int i = 1;i <= 9;i++){
		 for(int j = 1;j <= i; j++){
			 System.out.print(j+"*"+i+"="+i*j+"\t");
			 
			 }
		 System.out.println();
	 }
	
	}

}
