package sortsAndSearch;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
     int ar[];
	public static void main(String[] args)
	{
  LinearSearch ob= new LinearSearch();
   ob.num();
		
	}

	public void num()
	{
	    Scanner scan =new Scanner(System.in);
		ar= new int[]{42,15,36,33,54};
		System.out.println(Arrays.toString(ar));
		System.out.println("enter the find number");
		int find =scan.nextInt();
		boolean flag=false;
		int num=0;
	    for(int i=0;i<ar.length;i++)
	    {
	    	if(ar[i]==find)
	    	{
	    		 flag = true;
	    		 num=i;
	    		break;
	    	}
	    }
	    
	    if(flag)
	    {
	    	System.out.println("element found "+num);
	    }
	    else
	    {
	    	System.out.println("element cannot found");
	    }
		
	}
}
