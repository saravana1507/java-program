package eb_bill;

public interface Eb {
	void setId(int customer_id);
	int getId();
	void setName(String customer_name);
	String getName(); 
	void eb_bill(int current_reading);
	void display();
}
