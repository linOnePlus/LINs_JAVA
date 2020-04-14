/**
 * 猜数字小游戏
 * 键盘录入一个数字，用Math类里的random（）方法生成随机数
 * 用if语句判断录入数字和随机数的大小
 * author linoneplus
 */
package practiceDay7;
import java.util.*;
public class randomgame {

	public static void main(String[] args) {
		Scanner a=new Scanner (System.in);
		int r=(int)(Math.random()*10+1);
for(;;){
		System.out.println("请输入一个整数数字");
		int x=a.nextInt();
		
		
		if(x>r){
			System.out.println("您输入的数字过大");
		}else if(x<r){
			System.out.println("您输入的数字太小");
		}else{
			System.out.println("您猜对了。");
			break;
		}
		
	}System.out.println("游戏结束，祝您生活愉快");
	}
}
