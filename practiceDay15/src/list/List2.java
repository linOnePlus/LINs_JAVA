package list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class List2 {

	public static void main(String[] args) {
   List<Object> li =new ArrayList<>();
   li.add(1);
   li.add(2);
   li.add(3);
   li.add(4);
   System.out.println(li);//输出集合里面所有的元素
   Set<Object> se =new TreeSet<Object>();
   se.add(1);
   se.add(2);
   se.add(3);
   se.add(4);
   System.out.println(se);
   
	}

}
