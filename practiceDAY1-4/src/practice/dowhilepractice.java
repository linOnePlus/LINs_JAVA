package practice;

public class dowhilepractice {

	public static void main(String[] args) {
		int count = 0;
		int a = 100;
		  do{
			int ge =a % 10;
			int shi = a / 10 % 10;
			int bai = a /10 /10 %10;
			if(ge*ge*ge+shi*shi*shi+bai*bai*bai == a)/*绝对不能有;*/{
				count++;
			}
			a++;
			}while(a<=999);
		System.out.println("个数"+count);
		
	}

}
