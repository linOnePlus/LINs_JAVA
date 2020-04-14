package practiceDAY6;

public class noname100 {

	public static void main(String[] args) {
	    for(int i=1;i<=100;i++){
	    	method(new car());//匿名对象当做参数。
	    }
   
	}
	public static void method(car c){
    	c.brand ="奔驰c200";
    	c.num=4;
    	c.price=250000;
    	c.run();
    }

}
 class car{
	String brand;
	int num;
	int price;
	public void run(){
		System.out.println(brand+"..."+price+"..."+num);
	}
}
