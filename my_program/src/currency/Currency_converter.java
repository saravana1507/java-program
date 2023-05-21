package currency;

public class Currency_converter extends Difference_money{

	public static void main(String[] args) {
     Money currency=new Currency_converter();
     currency.usd_to_rupee(5);
     currency.rupee_to_usd(300);
     currency.euro_to_rupee(9);
     currency.rupee_to_euro(543);
     currency.usd_to_euro(12);
     currency.euro_to_usd(17);
     
	}

}
