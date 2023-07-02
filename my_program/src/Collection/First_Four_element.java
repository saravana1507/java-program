package Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class First_Four_element {
	public static void main(String[] args) {
	    List <Integer> l=new ArrayList();
	    l.add(12);
	    l.add(14);
	    l.add(16);
	    l.add(13);
	    l.add(17);
	    l.add(18);
	    l.add(11);
	    l.add(19);
	    System.out.println(l);
	    ListIterator n= l.listIterator();
	    int count=4;
	    while(n.hasNext())
	    {  n.next();
	    	if(count>0) {
	    		n.remove();
	    		count--;}
	    }
	    System.out.println(l);
		}
}
