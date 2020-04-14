package LinkedListfengzhuang;

import java.util.LinkedList;

public class linkedlistfengzhuang {
private LinkedList a = new LinkedList();

public void in(Object obj){
	a.addLast(obj);
}
public Object out(){
	return a.removeLast();
}
public boolean isEmpty(){
	return a.isEmpty();
}
}
