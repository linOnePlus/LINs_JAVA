package practiceDAY6;

public class finalpractice {

	public static void main(String[] args) {
phone p1=new phone();
p1.setBrand("iphone");
System.out.println(p1.getBrand());
p1.setPrice(25001);
System.out.println(p1.getPrice());
p1.call();
	}

	
	
}
class phone{
private	String brand;
private	int price;
 public void setBrand(String brand){
	 this.brand = brand;//this.brand代表成员变量
 }
	public String getBrand(){
		return brand;//相当于this.brand this可以省略 系统会帮你加上
	}
	public void setPrice(int price){//为私有的成员变量提供 一个公共访问方式
		
		if(price>25000){
			System.out.println("来捣乱的吧。什么手机能这么贵");
		}
		else{this.price=price;}
	}
	public int  getPrice(){
		return this.price;//this.brand 可以省略 系统会帮你加上      输出了成员变量的默认值0
	}
	public void call(){
	System.out.println("打电话")	;
	}
}
