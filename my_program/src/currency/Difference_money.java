package currency;

public class Difference_money implements Money{


	public void usd_to_rupee(int usd) {
	float rupee=usd*82.91f;
	System.out.println(usd+" usd = "+rupee+" rupee");
	
	}

	public void rupee_to_usd(int rupee ) {
      		float usd=rupee/82.19f;
      		System.out.println(rupee+ " rupee = "+usd+" usd");
	}

	public void euro_to_rupee(int euro) {
		float rupee= euro*89.68f;
  		System.out.println(euro+" euro = "+rupee+" rupee");
	}

	public void rupee_to_euro(int rupee) {
		float euro= rupee/89.68f;
  		System.out.println(rupee+" rupee = "+euro+" euro");
	}

	public void usd_to_euro(int usd) {
		float euro= usd*1.08f;
  		System.out.println(usd+" usd = "+euro+" euro");
	}


	public void euro_to_usd(int euro) {
		float usd= euro/0.92f;
  		System.out.println(euro+" euro = "+usd+" usd");
		
	}
	

}
