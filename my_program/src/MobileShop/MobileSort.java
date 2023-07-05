package MobileShop;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class MobileSort  {
  Scanner scan=null;
	public void sort(List<Mobile> full) {
		
	Comparator<Mobile> sort=null;
	System.out.println(" choose to sorting");
	int num =scan.nextInt();
	 switch(num)
	 {
		 case 1:
		 {
			 sort=(Mobile a, Mobile b)-> {	 
			 return a.getName().compareTo(b.getName());	 
			 };
		 }
		 
		 case 2:
		 {
			 sort=(Mobile a, Mobile b)-> {	 
				 return a.getModel().compareTo(b.getModel());	 
				 };
		 }
		 case 3:
		 {
			 sort=(Mobile a,Mobile b) ->{
				 
				 if(a.getYear()>b.getYear())
				 {
					 return 1;
				 }
				 
				 if(a.getYear()>b.getYear())
				 {
					 return -1;
				 }
				return 0; 
				
			 };
		 }
	 }
	}

}
