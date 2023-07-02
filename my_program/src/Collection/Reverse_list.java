package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Reverse_list {

	public static void main(String[] args) {
		 List<String> name= new ArrayList();
	     name.add("saravana");
	     name.add("ragul");
	     name.add("senthil");
	     name.add("kavin");
	     name.add("lajeem");
	     name.add("mahadevan");
	     System.out.println(name);
	    // using normal method to reverse
	    for(int i=0;i<name.size();i++)
	    {
	    	for(int j=i+1;j<name.size();j++)
	    	{
	    		String temp=(String)name.get(i);
	    		name.set(i,(String) name.get(j));
	    		name.set(j,temp);
	    	}
	    }
	    System.out.println("REVERSE THE LIST\n");
	    System.out.println(name+"\n");
	    //list method using to reverse
	         Collections.reverse(name);
	         System.out.println(name);
	}
	

}
