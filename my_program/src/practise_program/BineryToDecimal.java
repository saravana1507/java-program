package practise_program;

import java.util.Scanner;

public class BineryToDecimal {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println(" enter the binery number:");
int a=scan.nextInt();
int n=0;
int decimal=0;
for(int i=0;i<a;a/=10)
{
	int num=a%10;
	decimal+=num*Math.pow(2, n);  // 0*2 power 0 
     n++;
}
System.out.println(decimal);
	}

}
