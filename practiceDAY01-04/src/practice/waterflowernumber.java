package practice;
//water number is xxx level.
public class waterflowernumber {

	public static void main(String[] args) {
		for(int i=100;i<999;i++){
			int ge =i %10;
			int shi=i / 10 % 10;
			int bai=i / 10 / 10 % 10;
			
			if(ge * ge* ge +  shi *shi * shi+ bai * bai * bai==i){
				System.out.println("100-1000的水仙花数有"+i);
			}
		}
				
			
		}
			

	}

