package review;

public class datatype {

	public static void main(String[] args) {
		System.out.println('s');
    char s ='林';
    int a=5;
    System.out.println(s+a);//char类型的数据根据ASCII表   数据类型从小到大byte short char int .float double
    int j=3;
    float k=10.2f;
    System.out.println(k/j);//隐式转换
    System.out.println(10/3.0);//两个整数相除还是整数，这里用了隐式转换
    System.out.println(5!=6);//比较运算符结果是布尔类型
    
    int v=9;
    int q=8;
    int temp;
    temp=v;
    v=q;
    q=temp;
    System.out.println(v+"  "+q);
    System.out.println('\'');
    
    a:for(int i=1;i<=10;i++){
    	System.out.println("i"+i);
    	b:for(int z=1;z<=10;z++) {
    		System.out.print("z"+z);
    	System.out.println("");
    	break b;}//跳出B循环
    }
	}

}
