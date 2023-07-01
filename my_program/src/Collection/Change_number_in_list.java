package Collection;
// change particular number in this list


import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Change_number_in_list {

	public static void main(String[] args) {
		Change_number_in_list ob= new Change_number_in_list();
		ob.number();
		ob.numbers();
		
		}     
	
	// arraylist method use in this method
	public void number() {
		 List<Integer> number= new ArrayList();
	       number.add(5);
	       number.add(7);
	       number.add(5);
	       number.add(4);
	       number.add(8);
	       System.out.println(number);
	       
	       for(int i=0;i<number.size();i++)
	       {
	    	   if(number.get(i)==5)
	    	   {
	    		   number.set(i, 6);
	    	   }
	       }
	       System.out.println("after change list");
	       System.out.println(number);
	}
	
	// listiterator method used in this method
	public void numbers()
	{
		 List<Integer> num= new ArrayList();
	       num.add(5);
	       num.add(7);
	       num.add(5);
	       num.add(4);
	       num.add(8);
	      System.out.println("\n"+num);
	      ListIterator<Integer> change= num.listIterator();
	      while(change.hasNext())
	      {
	    	  
	    	  if((int)change.next()==5)
	    	  {
	    		  change.set(9);
	    	  }
	      }
	      System.out.println("after change list");
	       System.out.println(num);
	}

}
