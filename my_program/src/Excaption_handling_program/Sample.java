package Excaption_handling_program;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Sample {

	public static void main(String[] args) {
		Sample ob= new Sample();
     Scanner scan=new Scanner(System.in);
	System.out.println(" enter the number:");
     int a;
	int b;
	try {
		a=scan.nextInt();
		b=scan.nextInt();
		ob.add(a, b);
		ob.division(a, b);
	    ob.multi(a, b);
	}
		catch(ArithmeticException o)
	{
			System.out.println("cannot divide by zero");
	}
	catch(InputMismatchException i)
	{
		System.out.println("only assign a interger value");
	}
	catch(Exception p)
	{
		System.out.println("please re-enter the number");
	}
	finally {
		ob.last();
	}
		
	}
	
	public void add(int a,int b)
	{
		System.out.println(a+b);
	}
	
	public void division(int a,int b)
	{
		System.out.println(a/b);
	}
	
	public void multi(int a,int b)
	{
		System.out.println(a*b);
	}
	
	public void last() {
		System.out.println("thank you");
	}

}
