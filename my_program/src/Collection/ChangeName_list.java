package Collection;
//change particular name to create program
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ChangeName_list {

	public static void main(String[] args) {
		ChangeName_list ob= new ChangeName_list();
		ob.name();
		ob.rename();
		
	}
	
	// iterator class used in this method
	
public void name() {
	  List<String> name= new ArrayList();
      name.add("saravana");
      name.add("senthil");
      name.add("rahul");
      name.add("saravana");
      name.add("kavin");
      System.out.println(name);
      ListIterator<String> change=name.listIterator();
      while(change.hasNext()) {
    	  if(change.next()=="saravana")
    	  {
    		  change.set("kumar");
    	  }
      }
      System.out.println("After change list");
      System.out.println(name);
      }

// this method used for arraylist method
public void rename() {
	  List<String> name= new ArrayList();
    name.add("saravana");
    name.add("senthil");
    name.add("rahul");
    name.add("saravana");
    name.add("kavin");
    System.out.println("\n"+name);
   
 for(int i=0;i<name.size();i++)
 {
	 if(name.get(i)=="saravana")
	 {
		 name.set(i, "kumar");
	 }
 }

 System.out.println("After change list");
 System.out.println(name);
}
}