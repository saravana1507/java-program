package Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Reverse_element {

	public static void main(String[] args) {
		 List<Integer> l= new ArrayList();
		    l.add(45);
		    l.add(42);
		    l.add(4);
		    l.add(40);
		    l.add(47);
		    l.add(8);
		    System.out.println(l);
		    ListIterator it=l.listIterator();
		    while(it.hasNext())
		    {
		    	it.next();
		    }
		    while(it.hasPrevious())
		    {
		    	it.previous();
		    }
		    System.out.println("reverse");
		    System.out.println(l);
	}
}
