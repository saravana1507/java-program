package Collection;

import java.util.ArrayList;
import java.util.List;

public class RotationList {

	public static void main(String[] args) {
		RotationList ob= new RotationList();
		ob.clock();
		ob.anticlock();
			}
	
	// clockwise rotate the element
public void clock()
{
	 List<String> name= new ArrayList();
     name.add("saravana");
     name.add("ragul");
     name.add("senthil");
     name.add("kavin");
     name.add("lajeem");
     name.add("mahadevan");
     System.out.println("clockwise element:\n");
     System.out.println(name);
    //ListIterator reverse= name.listIterator();
    for(int i=0;i<name.size()-1;i++)
    {
    	String temp=(String)name.get(i+1);
    	name.set(i+1,(String)name.get(i) );
    	name.set(i, temp);
    }
    System.out.println(name);
}
// anticlock wise rotate the element
public void anticlock() {
	 List<String> name= new ArrayList();
     name.add("saravana");
     name.add("ragul");
     name.add("senthil");
     name.add("kavin");
     name.add("lajeem");
     name.add("mahadevan");
     System.out.println("\nanti-clockwise element:\n");
     System.out.println(name);
    //ListIterator reverse= name.listIterator();
    for(int i=name.size()-1;i>0;i--)
    {
    	String temp=(String)name.get(i-1);
    	name.set(i-1,(String)name.get(i) );
    	name.set(i, temp);
    }
    System.out.println(name);

}
}
