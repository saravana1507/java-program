package encapsulation;
import java.util.Scanner;
public class Mobile extends Mobileshop {
	int mobile_price;
	String mobile_name;
	String old_mobile;
final static String mobile_shop="poorvika";
	Mobile() {
		System.out.println("       "+mobile_shop);
		System.out.println("-------------------------------");
		System.out.println("limited offer");	
		System.out.println("mobile price list notice");
	}
	Mobile(String old_mobile)
	{
		this.old_mobile=old_mobile;
		System.out.println( old_mobile +" exchanged");
		
	}

	Mobile(int mobile_price, String mobile_name) {
		this.mobile_name = mobile_name;
		this.mobile_price = mobile_price;
		System.out.println("mobile name = " + mobile_name);
		System.out.println("mobile price = " + mobile_price);
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
		Mobile obj= new Mobile();
		Scanner s =new Scanner(System.in);
		System.out.print("old mobile name =");
		String n= s.nextLine();
		 obj=new Mobile(n);
		System.out.print("new mobile=");
		String name= s.nextLine();
		System.out.print("amount =");
		int amt= s.nextInt();
		obj= new Mobile(amt, name);
	    s.close();
	}
}
