package eb_bill;

public class Eb_calculator extends Eb_bill {

	public static void main(String[] args) {
	Eb customer=new Eb_bill(12321,"saravana");
	customer.eb_bill(200);
	customer.display();
	customer.eb_bill(500);
	customer.display();
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