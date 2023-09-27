package practise_program;

import java.text.SimpleDateFormat;
import java.util.Date;

public class prac {
	
	    @SuppressWarnings("deprecation")
		public static void main(String [] args) 
	    { 
	    	Date d= new Date();
	    	System.out.println(d);
	        Date f= new Date(1L);
	        System.out.println(f);
	    	Date t= new Date(2000,11,21);
	    	SimpleDateFormat ob= new SimpleDateFormat("d &M &y");
	    	System.out.println(ob.format(d));
	    	
           
	    }
	    }
	 
	    