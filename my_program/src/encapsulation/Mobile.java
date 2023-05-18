package encapsulation;

public class Mobile {
	int mobile_price;
	String mobile_name;

	Mobile() {
		System.out.println("price list notice");
	}

	Mobile(int mobile_price, String mobile_name) {
		this();
		this.mobile_name = mobile_name;
		this.mobile_price = mobile_price;
		System.out.println("mobile name = " + mobile_name);
		System.out.println("mobile price = " + mobile_price);
		
		if (mobile_price <= 10000 && mobile_price >= 3000) {
         System.out.println("offer one headphone");
		}
		if (mobile_price > 10000 && mobile_price <= 20000) {
			System.out.println("offer one bluetooth");
		}
		if (mobile_price > 20000) {
			System.out.println("offer one keypad mobile ");
		}
	}

	Mobile(int mobile_price, String mobile_name, String old_mobile) {
		this(mobile_price, mobile_name);
		System.out.println("OLD mobile = " + old_mobile);
		System.out.println("extra one selfie stick");
	}

	static public void main(String arg[]) {
		Mobile customer = new Mobile(14000, "samsung", "nokia");
		System.out.println("-------------------------------");
		Mobile customer1 = new Mobile(70000, "apple");
	}
}
