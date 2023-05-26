package array;

import java.util.Scanner;

public class Find_the_number {
	public static void main(String avg[])
	{
   Find_the_number ob=new Find_the_number();
   ob.number();
	}
	void number() {
		Scanner s = new Scanner(System.in);
		System.out.print(" enter the size number :");
		int size = s.nextInt();
		int num[] = new int[size];
		System.out.println("enter the number : ");
		for (int i = 0; i < size; i++) {
			num[i] = s.nextInt();
		}
		System.out.print("number :");
		for (int i = 0; i < num.length; i++) {
		   System.out.print(num[i]+" ");
		}
       System.out.println("\n"+"customer search the number :");
       int search=s.nextInt();
       for(int i=0;i<num.length;i++)
       {
    	 
    	   if(num[i]==search)
    	   {
    		   System.out.println("found the number is " +num[i]);
    		 
    		   break;
    		   
    	   }
    	 if(i==num.length-1)
    	   {
    		   System.out.println("cannot found the number ");
    	   }
    		  
	       }
       s.close();
	}
}
