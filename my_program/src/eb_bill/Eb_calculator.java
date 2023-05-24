package eb_bill;
import java.util.Scanner;
public class Eb_calculator extends Eb_bill {

	public static void main(String[] args) {
	Eb customer=new Eb_bill(12321,"saravana");
	Scanner s=new Scanner(System.in);
	System.out.print("enter the current reading =");
	int n= s.nextInt();
	customer.eb_bill(n);
	customer.display( );
	s.close();

	}
   
}




//output:
//	
//	--------EB BILL---------
//	customer name =saravana
//	customer id =12321
//	current reading=200
//	Enter the bill amount =Rs.225.0
//	current reading=500
//	Enter the bill amount =Rs.675.0