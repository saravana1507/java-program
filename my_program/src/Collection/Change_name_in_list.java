package Collection;

import java.util.ArrayList;
import java.util.List;

public class Change_name_in_list {
	public static void main(String ar[]) {
	 List<String> name= new ArrayList();
     name.add("saravana");
     name.add("ragul");
     name.add("senthil");
     name.add("kavin");
     name.add("ragul");
     
     System.out.println(name);
     
     for(int i=0;i<name.size();i++)
     {
  	   if(name.get(i)=="ragul")
  	   {
  		   name.set(i, "rahul");
  	   }
     }
     System.out.println("after change list");
     System.out.println(name);
	}
	
}

