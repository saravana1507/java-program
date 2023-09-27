package practise_program;

import java.util.Scanner;

public class BineryToOctal {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println(" enter the binery number:");
		int a=scan.nextInt();
		int n=0;
		int decimal=0;
		for(int i=0;i<a;a/=10)
		{
			int num=a%10;
			decimal+=num*Math.pow(2, n);
		     n++;
		}
	     System.out.println(decimal);

     int octal=0;
     int no=1;
     for(int i=0;i<decimal;decimal/=8)
     {
    	 int digit=decimal%8;
    	 octal=(digit*no)+octal;
    	 no*=10;
     }
     
     System.out.println(octal);
     
	
	}

}
