package currency;
import java.util.Scanner;
public class Currency_converter extends Difference_money{

	public static void main(String[] args) {
     Money currency=new Currency_converter();
     Scanner scan=new Scanner(System.in);
     System.out.print("enter usd value = ");
     int a= scan.nextInt();
     currency.usd_to_rupee(a);
     System.out.print("enter rupee value = ");
     int b= scan.nextInt();
     currency.rupee_to_usd(b);
     System.out.print("enter euro value = ");
     int c= scan.nextInt();
     currency.euro_to_rupee(c);
     System.out.print("enter rupee value = ");
     int d= scan.nextInt();
     currency.rupee_to_euro(d);
     System.out.print("enter usd value = ");
     int e= scan.nextInt();
     currency.usd_to_euro(e);
     System.out.print("enter euro value = ");
     int f= scan.nextInt();
     currency.euro_to_usd(f);
     scan.close();
     
	}

}
