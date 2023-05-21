package eb_bill;

public class Eb_calculator extends Eb_bill {

	public static void main(String[] args) {
	Eb customer=new Eb_bill(12321,"saravana");
	customer.eb_bill(200);
	System.out.println("total reading = "+Eb_bill.reading);
	customer.eb_bill(300);
	System.out.println("total reading = "+Eb_bill.reading);
	customer.eb_bill(1100);  
	}

}
