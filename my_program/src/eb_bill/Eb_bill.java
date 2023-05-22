package eb_bill;

public class Eb_bill implements Eb {
	static int reading;
	String customer_name;
	int customer_id;
	float paid;
	float pay=2.25f;
	float pay1= 4.50f;
	float pay2= 6.00f;
	float pay3= 8.00f;
	float pay4= 9.00f;
	float pay5= 10.00f;
	float pay6= 11.00f;


	Eb_bill() {
		System.out.println("--------EB BILL---------");
	}

	Eb_bill(int customer_id, String customer_name) {
		this();
		this.customer_id = customer_id;
		this.customer_name = customer_name;
		System.out.println("customer name =" + customer_name);
		System.out.println("customer id =" + customer_id);
	
	}

	public void setId(int customer_id) {
		this.customer_id = customer_id;
		
	}

	public int getId() {
		System.out.println("customer id =" + customer_id);
		return customer_id;
	}

	public void setName(String customer_name) {
		this.customer_name = customer_name;
	}

public	String getName() {
		System.out.println("name =" + customer_name);
		return customer_name;
	}

	public void eb_bill(int current_reading) {
		int usage_eb = current_reading - reading;
		reading = current_reading;
		if (usage_eb < 500) {
			if (usage_eb <= 100) {
			}
			if (usage_eb <= 200 && usage_eb > 100) {
				int amount = usage_eb - 100;
				paid = amount * pay;

			}
			if (usage_eb <= 400 && usage_eb > 200) {
				int unit = usage_eb - 200;
				paid = unit * pay1 + (100 * pay);
			}
			if (usage_eb <= 500 && usage_eb > 400) {
				int unit = usage_eb - 400;
				paid = unit * pay2 + (200 * pay1) + (100 * pay);
			}
		}
		if(usage_eb>500)
		{
		if (usage_eb <= 100) {
		}
		if (usage_eb <= 400 && usage_eb > 100) {
			int amount = usage_eb - 100;
			paid = amount * pay1;

		}
		if (usage_eb <= 500 && usage_eb > 400) {
			int unit = usage_eb - 400;
			paid = unit * pay2 + (300 * pay1);
		}
		if (usage_eb <= 600 && usage_eb > 500) {
			int unit = usage_eb - 500;
			paid = unit * pay3 + (100 * pay2) + (300 * pay1);
		}
		if (usage_eb <= 800 && usage_eb > 600) {
			int unit = usage_eb - 600;
			paid = unit * pay4 + (100 * pay3) + (100 * pay2) + (300 * pay1);
		}
		if (usage_eb <= 1000 && usage_eb > 800) {
			int unit = usage_eb - 800;
			paid = unit * pay5 + (200 * pay4) + (100 * pay3) + (100 * pay2) + (300 * pay1);
		}
		if (usage_eb > 1000) {
			int unit = usage_eb - 1000;
			paid = unit * pay6 + (200 * pay5) + (200 * pay4) + (100 * pay3) + (100 * pay2) + (300 * pay1);
		}
		}
		
	}
public void display() {
	System.out.println("current reading="+reading);
	System.out.println("Enter the bill amount =Rs." + paid);
}
}
