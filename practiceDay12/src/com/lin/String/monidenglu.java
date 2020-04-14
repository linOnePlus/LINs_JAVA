package com.lin.String;
/*模拟登录*/
import java.util.Scanner;

public class monidenglu {

	public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    for (int i = 1; i < 4; i++) {
    System.out.println("请输入用户名");
    String username =sc.next();
    System.out.println("请输入密码");
    String password =sc.next();
    if (username.equals("admin")&&password.equals("admin")) {
    	/*调用String类的username对象的equals方法来判断
    	 * 这里有点不足，应该用常量ADMIN调用EQUALS方法，防止变量里出现NULL*/
		System.out.println("登录成功");
		break;//跳出循环
	} else{
		if(i==3){
			System.out.println("您的错误次数已经达到最大值");
		}else{
			System.out.println("登录失败还有"+(3-i)+"次机会");//算法奥秘所在			
		}
	}
	}
    sc.close();
}
}
