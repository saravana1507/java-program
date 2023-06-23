package Excaption_handling_program;

import java.util.Scanner;
public class Sample2 {

	public static void main(String[] args) {
		Sample2 emp=new Sample2();
		emp.number();

	}
	
	public void number()
	{   
		Scanner scan= new Scanner(System.in);
	    System.out.println(" enter the size:");
	    int n=scan.nextInt();
	    System.out.println(" enter the add:");
	    int add=scan.nextInt();
	    int a[]=new int[n];
	    System.out.println(" enter the number:");
	    try {
	    for(int i=0;i<a.length+add;i++)
	    {
	    	a[i]=scan.nextInt();
	    }
	    }
	    catch(IndexOutOfBoundsException e)
	    {
	    	System.out.println("array length over");
	    }
	    catch(Exception e)
	    {
	    	System.out.println(" please again input the number");
	    }
	    finally
	    {
	    	letter();
	    }
	    
	}

	public void letter()
	{
		System.out.println(" thank you");
	}
	
}
