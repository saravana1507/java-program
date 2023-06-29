package Collection;

import java.util.ArrayList;
import java.util.List;

public class Methods_sample {

	public static void main(String[] args) {
	
		
		@SuppressWarnings("rawtypes")
		List<Comparable> no= new ArrayList<Comparable>();
		// add method in ArrayList
		// add the any object to use this method
		 no.add(100);
		 no.add('M');
		 no.add("saravana");
		 no.add(5.5);
		 no.add(true);
		 System.out.println(no);
		 
		 // contains method
		 // passing parameter object to found is true otherwise false
		 boolean n= no.contains('M');
		 System.out.println("\nCONTAIN METHOD:");
		 if(n)
		 {
			 System.out.println("i founded");
		 }
		 else
		 {
			 System.out.println("i am not founded");			 
		 }
		 
	    	 // get method
	    	 // which index seeing to this method used
		 System.out.println("\nGET METHOD:");
             System.out.println( no.get(1));
             
             // set method
             // which index element change to any element this method used
             no.set(1, 'm');
             System.out.println("\nSET METHOD:");     
             System.out.println(no);
             
             //size method
             // this method used for total size in ArrayList
             System.out.println("\nSIZE METHOD:");
             System.out.println(no.size());
             
             // indexOf method
             // this method used for any element passing the parameter that element in the ArrayList that index showing
             // cannot find the parameter element output -1 showing
             System.out.println("\nINDEXOF METHOD:");
             System.out.println( no.indexOf(1));
             System.out.println( no.indexOf("saravana"));
             
             // toArray method
             // this method list element convert to array
             System.out.println("\nTOARRAY METHOD:");
             Object[] ob=no.toArray();
             for(Object i:ob)
             {
            	 System.out.println(i);
             }
             // remove method
             // Particular index value remove to used this method
             no.remove(true);
             System.out.println("\nREMOVE METHOD:");
             System.out.println(no);
             
             // removeAll method
             // this method used for all index value removed in the ArrayList
             no.removeAll(no);
             System.out.println("\nREMOVEALL METHOD:");
             System.out.println(no);
             
	}

}
