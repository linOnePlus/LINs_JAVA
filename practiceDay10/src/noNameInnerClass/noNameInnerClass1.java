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
			System.out.println("��д");
		}
	}
	public void zhijie(){//ֱ���������ڲ������print����
		inner a =new  inner();
		a.print();
	}
	
	public void niming(){
		new Inter() {
			@Override
			public void print() {
				System.out.println("������д");
			}
		}/*ǰ��һ�������ӿڵ��������*/.print();
	}
	
}
