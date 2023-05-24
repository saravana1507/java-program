package unit_Converter;
import java.util.Scanner;
public class Unit_converter extends Length {

	public static void main(String[] args) {
	Converter unit=new Unit_converter();
	Scanner s= new Scanner(System.in);
	System.out.print("enter the kilometer value =");
	int a=s.nextInt();
	unit.km_to_m(a);
	System.out.print("enter the meter value =");
	int b=s.nextInt();
	  unit.m_to_km(b);
	System.out.print("enter the kilometer value =");
	int c=s.nextInt();
	 unit.km_to_cm(c);
	 System.out.print("enter the centimeter value =");
	 int d=s.nextInt();
	 unit.cm_to_km(d);
	 System.out.print("enter the meter value ="); 
	int e=s.nextInt();
	unit.m_to_cm(e);
	System.out.print("enter the meter value =");
	int f=s.nextInt();
	  unit.cm_to_m(f);
	  s.close();
	}

}
