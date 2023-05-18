package encapsulation;

public class Bank_details {

	public static void main(String[] args) {
	
		Bank_account customer=new Bank_account("saravana",0221,03124512,010000);
		Bank_account customer1=new Bank_account("rahul",3423,32132144,5000);
		customer1.setcredit(2000);
	    customer1.getcredit();
	    customer1.setdebit(10000);
	    customer.setcredit(900);
	    customer.getcredit();
	  
	  
		
	}

}
