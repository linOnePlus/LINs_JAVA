package noNameInnerClass;

public class noNameInnerClass1 {
public static void main(String[] args) {
    outer b=new outer();
    b.zhijie();
    b.niming();
}
}
interface Inter{
	public void print();
}

class outer {
	class inner implements Inter{
		public void print(){
			System.out.println("重写");
		}
	}
	public void zhijie(){//直接用有名内部类调用print方法
		inner a =new  inner();
		a.print();
	}
	
	public void niming(){
		new Inter() {
			@Override
			public void print() {
				System.out.println("匿名重写");
			}
		}/*前面一整块代表接口的子类对象*/.print();
	}
	
}
