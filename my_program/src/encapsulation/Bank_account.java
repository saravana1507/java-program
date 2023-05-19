package encapsulation;

// bank account using encapsulation and constructor
public class Bank_account {
final static String bankname="STATE BANK OF INDIA";
	private String name;
	static String ifsc="Sbi000432";
	static String branch="vedasandur";
	private int atm_pin;
	private int account_no;
	private int bank_balance;

	Bank_account() {
		System.out.println("------------------------------------");
		System.out.println("     "+ bankname + "\n"+"    ---------------------"+"\n" + "branch name = " + branch);
		System.out.println("ifsc code = " + ifsc + "\n");
	}
	
	Bank_account(String name, int atm_pin, int account_no, int bank_balance) {
		this();
		this.name = name;
		this.atm_pin = atm_pin;
		this.account_no = account_no;
		this.bank_balance = bank_balance;
		System.out.println("account name = " + name + "\n" + "account number = " + account_no +
				"\n" + "atm pin = "+ atm_pin + "\n" + "bank_balance = " + bank_balance + "\n");
	}
	
	void setbanknum(int account_no) {
		this.account_no = account_no;
	}

	int getbanknum() {
		System.out.println("account number = " + account_no);
		return account_no;
	}

	void setcredit(int bank_balance) {
		if (bank_balance <= 25000) {
			this.bank_balance = this.bank_balance + bank_balance;
			System.out.println("amount was credit in your account");
		} else {
			System.out.println("limited over in amount");
		}
	}

	int getcredit() {
		System.out.println(" current balance = " + bank_balance);
		return this.bank_balance;
	}

	void setdebit(int bank_balance) {
		if (this.bank_balance >= bank_balance) {
			this.bank_balance = this.bank_balance - bank_balance;
			System.out.println("amount was debit in your bank");
		} else {
			System.out.println("insuffient balance in your account");
		}
	}

	int getdebit() {
		System.out.println(" current balance = " + this.bank_balance);
		return this.bank_balance;
	}

	void setname(String name) {
		this.name = name;
		System.out.println("Name was updated");
	}

	String getname() {
		System.out.println("bank account name = " + name);
		return name;
	}

	void setatm(int atm_pin) {
		this.atm_pin = atm_pin;
		System.out.println(" atm pin was updated");
	}

	int getatm() {
		System.out.println("atm pin is = " + atm_pin);
		return atm_pin;
	}
	
}
