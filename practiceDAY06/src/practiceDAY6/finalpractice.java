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
	 this.brand = brand;//this.brand�����Ա����
 }
	public String getBrand(){
		return brand;//�൱��this.brand this����ʡ�� ϵͳ��������
	}
	public void setPrice(int price){//Ϊ˽�еĳ�Ա�����ṩ һ���������ʷ�ʽ
		
		if(price>25000){
			System.out.println("�����ҵİɡ�ʲô�ֻ�����ô��");
		}
		else{this.price=price;}
	}
	public int  getPrice(){
		return this.price;//this.brand ����ʡ�� ϵͳ��������      ����˳�Ա������Ĭ��ֵ0
	}
	public void call(){
	System.out.println("��绰")	;
	}
}
