package forloop;
import java.util.Scanner;

// input the number to find spy number or not
//input number=123;   sum : 1+2+3=6   product : 1*2*3=6;
// if sum and product same the number is spy number
public class Spynumber_forloop {

	public static void main(String[] args) {
		Spynumber_forloop ob=new Spynumber_forloop();
		ob.number();
	
	}
public void number()
{
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the number: ");
	 int n=scan.nextInt();
	 int num=n;
	 int sum=0;
	 int product=1;
	 for(int i=0;i<num;num/=10) {
		 int digit=num%10;
		  sum=sum+digit;
		 product=product*digit;
	 }
	 if(sum==product)
	 {
		 System.out.println(n+" is a spynumber");
	 }
	 else
	 {
		 System.out.println(n+" is a not spynumber");
	 }
}
}
