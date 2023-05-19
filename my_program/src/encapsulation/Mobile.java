package encapsulation;

public class Mobile extends Mobileshop {
	int mobile_price;
	String mobile_name;
	String old_mobile;
final static String mobile_shop="poorvika";
static void  offer()
{   System.out.println("     "+mobile_shop);
	System.out.println("limited offer");
}
	Mobile() {
		//System.out.println("       "+mobile_shop);
		System.out.println(" mobile price list notice");
	}
	Mobile(String old_mobile)
	{
        this();
        offer();
		this.old_mobile=old_mobile;
		System.out.println("  OLD mobile = " + old_mobile +" exchanged");
		
	}

	Mobile(int mobile_price, String mobile_name) {
		
		offer();
		this.mobile_name = mobile_name;
		this.mobile_price = mobile_price;
		System.out.println("  mobile name = " + mobile_name);
		System.out.println("  mobile price = " + mobile_price);
		if (mobile_price <= 10000 && mobile_price >= 3000) {
			System.out.println(" -- offer one headphone --");
		}
		if (mobile_price > 10000 && mobile_price <= 20000) {
			System.out.println(" -- offer one bluetooth --");
		}
		if (mobile_price > 20000) {
			System.out.println(" -- offer one keypad mobile --");
		}
	}

	static public void main(String arg[]) {
		offer();
		System.out.println("-------------------------------");
		Mobile customer1 = new Mobile();
		System.out.println("-------------------------------");
		Mobile customer = new Mobile("vivo");
		System.out.println("-------------------------------");
		Mobile customer2 = new Mobile(14000, "samsung");
		System.out.println("-------------------------------");
		Mobile customer3 = new Mobile(74000, "apple");	
	}
}
