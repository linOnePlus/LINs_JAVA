package practice;

public class whilepractice {

	public static void main(String[] args) {
		int sum=0;
		int i=0;
		while (i<=100){
			sum+=i;
			i++;
		}
		System.out.println(sum);
		
		//求个数：
		int count = 0;
		int a = 100;
		while(a<=999){
			int ge =a % 10;
			int shi = a / 10 % 10;
			int bai = a /10 /10 %10;
			if(ge*ge*ge+shi*shi*shi+bai*bai*bai == a)/*绝对不能有;*/{
				count++;
			}
			a++;
			}
		System.out.println("个数"+count);
		
	}

	}


