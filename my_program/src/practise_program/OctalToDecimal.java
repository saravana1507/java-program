package practise_program;

import java.util.Scanner;

public class OctalToDecimal {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println(" enter the octal number:");
		int a=scan.nextInt();
		int decimal=0;
		int n=0;
		for(int i=0;i<a;a/=10)
		{
			int digit=a%10;
			decimal+= digit*Math.pow(8, n);
			n++;
		}
System.out.println(decimal);
	}

}
