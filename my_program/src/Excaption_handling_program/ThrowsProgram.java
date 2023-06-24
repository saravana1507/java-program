package Excaption_handling_program;
import java.util.Scanner;

public class ThrowsProgram {
	static void divide (int a, int b) throws ArithmeticException,DenominatorException{
		if( a<=0) {
			throw new DenominatorException("Neumorator zero");
		}
		int c = a/b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		
		Scanner scan= new Scanner (System.in);
		System.out.println("enter the first number :");
		int first=scan.nextInt();
		System.out.println("enter the second number :");
		int second=scan.nextInt();
		try{
			divide(first,second);

		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
		  catch(DenominatorException e) 
		{ 
		  System.out.println(e.getMessage());  
	}
	}
}
