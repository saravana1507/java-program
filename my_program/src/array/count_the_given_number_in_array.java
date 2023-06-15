package array;

import java.util.Scanner;

public class count_the_given_number_in_array {

	public static void main(String[] args) {
		count_the_given_number_in_array ob=new count_the_given_number_in_array();
		Scanner s = new Scanner(System.in);
    ob.number(s);
	}
	void number(Scanner s) {
		int count=0;
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
    		  count++;    
    	   }
       }
     if(count>0)
     {
     System.out.println("total of found num : "+count);
     }
     else
     {
    	 System.out.println("cannot find number");
     }
     }
}