package practice;
import java.util.Scanner;//导入Scanner包
public class _scannerbylin {

	
	public static void main(String[] args) {
//求出三个数中的最大值 author：Lin one puls
		Scanner sc =new Scanner(System.in);//创建键盘录入对象
		
		System.out.print("输入第一个数");
		int x= sc.nextInt();//通过对象录取数据
		System.out.print("请输入第二个数字");
		int y = sc.nextInt();
		System.out.print("请输入第三个数字");
		int z = sc.nextInt();
		
//方法一：定义临时变量TEMP和最大值MAX
		
		/*sc.close();
		  int temp =(x>y)?x:y;
		int max =(temp>z)?temp:z;
		System.out.println("你所输入的三个值中最大值是"+max);*/
//方法二：IF语句嵌套使用
		sc.close();//关闭Scanner
		if(x>y){
			if(x>z){
				System.out.println("最大值是"+x);
			}else{
				System.out.println("最大值是"+z);
			}
		}else{
			if(y>z){
				System.out.println("最大值是"+y);
			}else{
				System.out.println("最大值是"+z);
			}
			
		}
		
		
		
		
		
		
		
		
		
		

	}

}
