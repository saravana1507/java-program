package eb_bill;

public class Eb_bill implements Eb {
	String customer_name;
	int customer_id;
	static int reading;

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
		float pay = 0;
		int usage_eb = current_reading - reading;
		reading = current_reading + reading;
		if (usage_eb < 500) {
			if (usage_eb <= 100) {
			}
			if (usage_eb <= 200 && usage_eb > 100) {
				int amount = usage_eb - 100;
				pay = amount * 2.25f;

			}
			if (usage_eb <= 400 && usage_eb > 200) {
				int unit = usage_eb - 200;
				pay = unit * 4.50f + (100 * 2.25f);
			}
			if (usage_eb <= 500 && usage_eb > 400) {
				int unit = usage_eb - 400;
				pay = unit * 6.00f + (200 * 4.50f) + (100 * 2.25f);
			}
		}
		if(usage_eb>500)
		{
		if (usage_eb <= 100) {
		}
		if (usage_eb <= 400 && usage_eb > 100) {
			int amount = usage_eb - 100;
			pay = amount * 4.50f;

		}
		if (usage_eb <= 500 && usage_eb > 400) {
			int unit = usage_eb - 400;
			pay = unit * 6.00f + (300 * 4.50f);
		}
		if (usage_eb <= 600 && usage_eb > 500) {
			int unit = usage_eb - 500;
			pay = unit * 8.00f + (100 * 6.00f) + (300 * 4.50f);
		}
		if (usage_eb <= 800 && usage_eb > 600) {
			int unit = usage_eb - 600;
			pay = unit * 9.00f + (100 * 8.00f) + (100 * 6.00f) + (300 * 4.50f);
		}
		if (usage_eb <= 1000 && usage_eb > 800) {
			int unit = usage_eb - 800;
			pay = unit * 10.00f + (200 * 9.00f) + (100 * 8.00f) + (100 * 6.00f) + (300 * 4.50f);
		}
		if (usage_eb > 1000) {
			int unit = usage_eb - 1000;
			pay = unit * 11.00f + (200 * 10.00f) + (200 * 9.00f) + (100 * 8.00f) + (100 * 6.00f) + (300 * 4.50f);
		}
		}
		System.out.println("Enter the bill amount =Rs." + pay);
	}

}
