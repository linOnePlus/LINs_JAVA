package LinkedListfengzhuang;

public class client {
/*用LINKEDLIST模拟栈数据进出*/
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
