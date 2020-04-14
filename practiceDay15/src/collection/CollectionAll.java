package collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionAll {

	public static void main(String[] args) {
 Collection<Student> c = new  ArrayList<>();
 c.add(new Student("lin", 21));
 c.add(new Student("lin", 21));
 Collection<Student> d =new ArrayList<Student>();
 d.add(new Student("lin",22));
 boolean addAll = c.addAll(d);
 boolean containsAll = c.containsAll(d);
 boolean retainAll = c.retainAll(d);
 System.out.println(addAll+""+retainAll+""+containsAll);
	}

}
