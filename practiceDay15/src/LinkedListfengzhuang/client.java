package LinkedListfengzhuang;

public class client {
/*��LINKEDLISTģ��ջ���ݽ���*/
	public static void main(String[] args) {
		linkedlistfengzhuang a = new linkedlistfengzhuang();
		a.in(1);
		a.in(2);
		a.in(3);
		while(!a.isEmpty()){
			System.out.println(a.out());
		}
	}

}
