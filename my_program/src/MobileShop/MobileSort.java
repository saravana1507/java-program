package MobileShop;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class MobileSort  {
	
// collection of mobile object to sorting in every element in this class	
  
  
	public void sort(List<Mobile> full) {
		System.out.println("\n\nSortlist list");
		System.out.println("\n 1- Name ascending order"+"\t"+"2-name descending order"+"\n"+
	          " 3 - year ascendending order"+"\t"+"4 - year descending order"+"\n"+
	          " 5 - ram ascending order"+"\t"+"6 - ram descending order"+"\n"+
	          " 7 - Capacity ascending order"+"\t"+"8 - capacity descending order"+"\n"+
	          " 9 - price ascending order"+"\t"+"10 - price descending order \n");
		
	Comparator<Mobile> sort=null;
	 Scanner scan =new Scanner(System.in);
	System.out.print(" choose to sorting : ");
	int num =scan.nextInt();
	boolean flag=false;
	switch(num)
	 {
	  
		 case 1:   // name ascending sort
		 {  
			 sort=(Mobile a, Mobile b)-> {	 
				 
			 return a.getName().compareTo(b.getName());	
			 
			 };
			 break;
		 }
		 case 2:   // name ascending sort
		 {  
			 sort=(Mobile a, Mobile b)-> {	 
				 
			 return b.getName().compareTo(a.getName());	
			 
			 };
			 break;
		 }
		 case 3:
		 {  
			 sort=(Mobile a,Mobile b) ->{
				 
				 if(a.getYear()>b.getYear())
				 {
					 return 1;
				 }
				 
				 if(a.getYear()<b.getYear())
				 {
					 return -1;
				 }
				return 0; 
				
			 };
			 break;
		 }
		 case 4:
		 {  
			 sort=(Mobile a,Mobile b) ->{
				 
				 if(a.getYear()<b.getYear())
				 {
					 return 1;
				 }
				 
				 if(a.getYear()>b.getYear())
				 {
					 return -1;
				 }
				return 0; 
				
			 };
			 break;
		 }
		 case 5:
		 {
			 sort=(Mobile a, Mobile b)-> {	 
			 return b.getRam().compareTo(a.getRam());	 
			 };
			 break;
		 }
		 case 6:
		 {
			 sort=(Mobile a, Mobile b)-> {	 
			 return a.getRam().compareTo(b.getRam());	 
			 };
			 break;
		 }
		 case 7:
		 {
			 sort=(Mobile a,Mobile b) ->{
				 
				 if(a.getCapacity()>b.getCapacity())
				 {
					 return 1;
				 }
				 
				 if(a.getCapacity()<b.getCapacity())
				 {
					 return -1;
				 }
				return 0; 
				
			 };
			 break;
		 }
		 
		 case 8:
		 {
			 sort=(Mobile a,Mobile b) ->{
				 
				 if(a.getCapacity()<b.getCapacity())
				 {
					 return 1;
				 }
				 
				 if(a.getCapacity()>b.getCapacity())
				 {
					 return -1;
				 }
				return 0; 
				
			 };
			 break;
		 }
		 
		 case 9:
		 {
			 sort=(Mobile a,Mobile b) ->{
				 
				 if(a.getPrice()<b.getPrice())
				 {
					 return 1;
				 }
				 
				 if(a.getPrice()>b.getPrice())
				 {
					 return -1;
				 }
				return 0; 
				
			 };
			 break;
		 }
		 case 10:
		 {
			 sort=(Mobile a,Mobile b) ->{
				 
				 if(a.getPrice()<b.getPrice())
				 {
					 return 1;
				 }
				 
				 if(a.getPrice()>b.getPrice())
				 {
					 return -1;
				 }
				return 0; 
				
			 };
			 break;
		 }
		 default:
		 {
			 System.out.println(" \n choose correct option");
			 flag=true;
			 sort(full);
			 break;
		 }
	 }
	
	 	 if(num!=2 && num!=6 && flag==false)
	 	 {
	 		 full.sort(sort);
	 		 for(Mobile i:full) {
	 		 System.out.println(i);}
	 	 }
	 	 
			
			  if(num==2||num==6 && flag==false) {
				  full.sort(sort); Collections.reverseOrder(sort);
			  for(Mobile i:full) 
			  { System.out.println(i);
			  } 
			  }
			 
	}
	
}
