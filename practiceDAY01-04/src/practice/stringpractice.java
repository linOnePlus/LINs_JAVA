package practice;
import java.util.Scanner;//导入SCanner包
public class stringpractice {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);//创建键盘录入对象，即使需要输入多次，只需要一次
		System.out.println("请输入你的名字");
		String name=sc.next();//输入 字符串 赋值给NAME
		//System.out.println("请输入你的性别");
		//String gender=sc.next();
		sc.close();//关水龙头

		/*String name = "陈润华";//STRING数据类型  一切未知 拿来输出汉字
		String gender="women";*/
		switch(name){
		/*case "陈润华":
			System.out.println("我认识你，你真好看");
			break;
		case"lzj":
			System.out.println("我也认识你，你跟crh一样好看");
			break;
			default:
				System.out.println("你谁啊 ，我不认识你，快关闭程序");
				*/
		//利用Case穿透
		case "陈润华":
		case"lzj":
			System.out.println("我认识你，你真好看");
			break;//SWITCH没有遇到BREAK或者}不会结束
		default:
			System.out.println("你谁啊 ，我不认识你，快关闭程序");
		}
			
			
		}
  
	}


