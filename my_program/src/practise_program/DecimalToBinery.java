package practise_program;

import java.util.Scanner;

public class DecimalToBinery {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println(" enter the Decimal number:");
		int a=scan.nextInt();
		int binery=0;
		int n=1;
		for(int i=0;i<a;a/=2)
		{
			int digit=a%2;
			binery=digit*n+binery;
			n*=10;
			
		}
		System.out.println(binery);
	}

}
