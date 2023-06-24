package Excaption_handling_program;

import java.util.Scanner;

public class Voter_eligible {

	public int input() {
		Scanner scan = new Scanner(System.in);
	System.out.println("Enter the age:");
		int ageNumber=scan.nextInt();
		scan.close();
		return ageNumber;
		
	}
	
	public void age(int num)
	
	{ 
		try {
		if(num<=0)
		{
			throw new NagetiveAgeException("negetive number not valid in age");
			
		}
		if(num>0 && num<18)
		{
			System.out.println("you are not eligible");
		}
		if(num>=18 && num<=150)
		{
			System.out.println("you are eligible");
		}
		if(num>150)
		{
			throw new OutOFAgeException("150 below age are entered");
		}
	}
	catch(NagetiveAgeException e)
	{

		System.out.println( e.getMessage());
		
	}
	catch(OutOFAgeException e)
	{
		System.out.println( e.getMessage());
		
	}		
		
	}

}
