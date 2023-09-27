package MobileShop;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class MobileSort  {
	
// collection of mobile object to sorting in every element in this class	
  
  
	public List<Mobile> sort(List<Mobile> full) {
		System.out.println("\n\nSortlist list");
		System.out.println("\n 1- Name ascending order"+"\t"+
	          " 2 - year ascendending order"+"\n"+" 3 - year descending order"+"\t"+
	          " 4 - ram ascending order"+"\n"+
	          " 5 - Capacity ascending order"+"\t"+" 6 - capacity descending order"+"\n"+
	          " 7 - price ascending order"+"\t"+" 8 - price descending order \n");
		
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
		 
		 case 2:  // year ascending order
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
		 case 3:      //year descending order
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
		 case 4:   // ram ascending order
		 {
			 sort=(Mobile a, Mobile b)-> {	 
			 return b.getRam().compareTo(a.getRam());	 
			 };
			 break;
		 }
		  case 5:   // capacity ascending order
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
		 
		 case 6:  // capacity descending order
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
		 
		 case 7:   // price ascending order
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
		 case 8: // price descending order
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
		 default:  // if choosing wrong again choosing
		 {
			 System.out.println(" \n choose correct option");
			 flag=true;
			 sort(full);
			 break;
		 }
	 }
	
	 	 if( flag==false)
	 	 {
	 		 full.sort(sort);
	 		 for(Mobile i:full) {
	 		 System.out.println(i);}
	 	 }
			 return full;
	}
	
	
	
	// Mobile name to choosing to find the list
	
  public List<Mobile> nameList(List<Mobile> sort){
	  Scanner scan= new Scanner(System.in);
	  System.out.println("\nMobiles:\n -> redmi\t -> vivo\n -> oppo\t -> samsung\n -> apple");
	  System.out.print("\nchoose the mobilename : ");
	  String name=scan.next();
	  List<Mobile> nameList=new LinkedList<>();
	for(Mobile i:sort)
	{
		if(i.getName().equals(name))
		{
	     nameList.add(i);
			
		}
	}
	
	if(nameList.isEmpty())
	{
		System.err.println("No mobile founded");
		nameList(sort);
	}
	
	for(Mobile i:nameList)	
	{
	  System.out.println(i);	
	}
	
	
	  return nameList;
  }
  
  
  
   
  
  // choosing year to find the list
  public List<Mobile> YearList(List<Mobile> sort){
	  Scanner scan= new Scanner(System.in);
	  System.out.println("\nMobiles year:\n -> 2021\n -> 2022\n -> 2023");
	  System.out.print("\nchoose the mobile year : ");
	  int year=scan.nextInt();
	  System.out.println("\nyearlist:\n 1.choosing year to greaterthan MobileList\n 2.choosing year to lesserthan Mobilelist\n 3.choosing year to Mobilelist");
      System.out.print("\nchoose year option:");
	  int choose=scan.nextInt();
	  List<Mobile> yearList= new LinkedList<>();
	  for(Mobile i:sort)
		{    if(choose==1) {  
			if(i.getYear()>=year)   // greater than price
			{
				yearList.add(i);
			}}
		if(choose==2) {
			if(i.getYear()<=year)  // less than price
			{
				yearList.add(i);
			}}
		if(choose==3) {
			if(i.getYear()==year)  // equal of price
			{
				yearList.add(i);
			}}
		}
	  if(yearList.isEmpty())
	  {
		  System.err.println("No mobile founded");
		  YearList(sort);
	  }
		for(Mobile i:yearList)
		{
		  System.out.println(i);	
		}
		
		  return yearList;
  }
  
  
  
  // choosing capacity to find the list
  public List<Mobile> capacityList(List<Mobile> sort){
	  Scanner scan= new Scanner(System.in);
	  
	  System.out.println("\nMobiles capacity :\n -> 64\n -> 128\n -> 256");
	  System.out.print("\nchoose the mobile capacity : ");
	  int capacity=scan.nextInt();
	  System.out.println("\npricelist:\n 1.choosing capacity to greaterthan MobileList\n 2.choosing capacity to lesserthan Mobilelist\n 3.choosing capacity to Mobilelist");
      System.out.print("\nchoose capacity option:");
	  int choose=scan.nextInt();
     
	  List<Mobile> capacityList= new LinkedList<>();
	  for(Mobile i:sort)
		{    if(choose==1) {  
			if(i.getCapacity()>=capacity)   // greater than price
			{
				capacityList.add(i);
			}}
		if(choose==2) {
			if(i.getCapacity()<=capacity)  // less than price
			{
				capacityList.add(i);
			}}
		if(choose==3) {
			if(i.getCapacity()==capacity)  // equal of price
			{
				capacityList.add(i);
			}}
		}
	  if(capacityList.isEmpty())
	  {
		  System.err.println("No mobile founded");
		  capacityList(sort);
	  }
		for(Mobile i:capacityList)
		{
		  System.out.println(i);	
		}
		
		  return capacityList;
  }
  
  
  
   // choosing to ram find in the list
  public List<Mobile> ramList(List<Mobile> sort){
	  Scanner scan= new Scanner(System.in);
	  System.out.println("\nMobiles ram:\n -> 4gb\n -> 6gb\n -> 8gb");
	  System.out.print("\nchoose the mobileram : ");
	  String ram=scan.next();
	   
	  List<Mobile> ramList=new LinkedList<>();
		for(Mobile i:sort)
		{
			if(i.getRam().equals(ram))
			{
		     ramList.add(i);
				
			}
		}
		
		if(ramList.isEmpty())
		{
			System.err.println("No mobile founded ");
			ramList(sort);
		}
		
		for(Mobile i:ramList)	
		{
		  System.out.println(i);	
		}
		  return ramList;
  }
  
  
  // Pricelist to choosing the list
 public List<Mobile> PriceList(List<Mobile> sort){
	  Scanner scan= new Scanner(System.in);
	  System.out.println("\nMobiles price:\n -> 10000\t -> 16000\n -> 17000\t -> 19000\n -> 26000\t -> 42000\n -> 48000\t -> 140000");
	  System.out.print("\nchoose the mobileprice : ");
	  int number=scan.nextInt();
	  System.out.println("\npricelist:\n 1.choosing price to greaterthan MobileList\n 2.choosing price to lesserthan Mobilelist\n 3.choosing price to Mobilelist");
     System.out.print("\nchoose price option:");
	  int choose=scan.nextInt();
    
	  List<Mobile> priceList= new LinkedList<>();
	  for(Mobile i:sort)
		{    if(choose==1) {  
			if(i.getPrice()>=number)   // greater than price
			{
				priceList.add(i);
			}}
		if(choose==2) {
			if(i.getPrice()<=number)  // less than price
			{
				priceList.add(i);
			}}
		if(choose==3) {
			if(i.getPrice()==number)  // equal of price
			{
				priceList.add(i);
			}}
		}
	  if(priceList.isEmpty())
	  {
		  System.err.println("No mobile founded");
		  PriceList(sort);
	  }
		for(Mobile i:priceList)
		{
		  System.out.println(i);	
		}
		
		  return priceList;
 }
 
 
 public List<Mobile> update(List<Mobile>list)
 {   
	 Scanner scan= new Scanner(System.in);
	 System.out.println("\nLIST:\n 1.sorting mobilelist \n 2.finding mobilelist");
	 try {
	 System.out.print("\nchoosing the option : ");
	 int choose=scan.nextInt();
	 
	 if(1==choose)
	 {	
		     sort(list);
	         System.out.print("do you sort again (yes/no) :");
	         String name=scan.next();
	                  if(name.equals("yes")) {
	                     update(list);}
	                
	                  if(name.equals("no"))
	                     {
	                    	System.out.println("thank you");
	                     }
     }    
	 else if(2==choose)
    {
    	System.out.println("\n\n 1 single choose list \t 2. multi choosilist\n");
    	 System.out.print("choosing the option : ");
    	int choose1=scan.nextInt();
    	         
    	    if(1== choose1)
    	       {
    	        	System.out.println("\n 1. name\t 2. year\n 3. ram\t     4. capacity\n 5. price\n");
    	        	System.out.print("choosing the option : ");
    	        	int choose2=scan.nextInt();
    		 
    	                  if(choose2==1)
    		                {
    	                	  nameList(list);
    		                }
    	                  else if(choose2==2)
    	                    {
    	                	  YearList(list);
    	                    }
    	                  else if(choose2==3)
    	                   {
    	                	  ramList(list);
    	                   }
    	                  else if(choose2==4)
    	                   {
    	                	  capacityList(list);
    	                   }
    	                  else if(choose2==5)
    	                   {
    	                 	  PriceList(list);
    	                   }
    	                  else
    	                   {
    	                	  System.err.print("\nchoose correct option ");
    	                	  update(list);
    	                   }
    	       }
    	    else if(choose1==2)
               {
    	    	System.out.println("\n 1. name,price\t 2. year,price\n 3. name,ram\t 4. capacity,price\n 5. ram,price\n");
    	    	System.out.print("choosing the option : ");
    	    	int choose3=scan.nextInt();
    	    			if(choose3==1)
    	    			{
    	    				PriceList(nameList(list));
    	    			}
    	    			else if(choose3==2)
    	    			{
    	    				PriceList(YearList(list));
    	    			}
    	    			else if(choose3==3)
    	    			{
    	    				ramList(nameList(list));
    	    			}
    	    			else if(choose3==4)
    	    			{
    	    				PriceList(capacityList(list));
    	    			}
    	    			else if(choose3==5)
    	    			{
    	    				PriceList(ramList(list));
    	    			}
    	    			else
    	    			{
    	    				System.err.println("\nplease choose correct option");
    	    				update(list);
    	    			}
               }
    	    	else
    	    	{
    	    		System.err.println("choosing correct input");
    	    		update(list);
    	    	}
    }
	 else
	 {
		 System.err.println("choosing correct input");
		 update(list);
	 }
	}
	catch(Exception e)
	 {
		System.err.println("your input was wrong. please assign correct input");
		update(list);
	 }
 return list;
}
}