package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

/*linkedlist特有方法*/
public class LinkedListDemo {
 public static void main(String[] args) {
LinkedList<Object>  list =new  LinkedList<Object>();
list.addFirst(555);
list.addLast(888);
list.addFirst(444);
list.addLast(999);
list.removeFirst();
list.removeLast();
list.getFirst();
list.getLast();
Iterator<Object> iterator = list.iterator();
while (iterator.hasNext()) {
	Object object = (Object) iterator.next();
	System.out.println(object);
	
}
}

}
