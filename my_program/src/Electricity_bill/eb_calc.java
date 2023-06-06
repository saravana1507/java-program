package Electricity_bill;
//Eb-calculator how many unit input value  to declare the  price 
import java.util.Scanner;

public abstract class eb_calc implements Eb {
	String name, date;
	int current_unit, rec, ebnum, usage_eb, unit;
	int fir_range = 0;       //unit range 0 to 500
	int fir_range1 = 100;
	int fir_range2 = 200;
	int fir_range3 = 400;
	int fir_range4 = 500;
	int sec_range = 0;      //unit range 500 to above unit
	int sec_range1 = 100;
	int sec_range2 = 400;
	int sec_range3 = 500;
	int sec_range4 = 600;
	int sec_range5 = 800;
	int sec_range6 = 1000;
	float unit_price, paid;
	float fir_fee = 0.0f;      // unit price in 0 unit to 500 unit
	float fir_fee1 = 2.25f;
	float fir_fee2 = 4.50f;
	float fir_fee3 = 6.00f;
	float sec_fee = 0.0f;     // unit price in 500 unit to above unit
	float sec_fee1 = 4.50f;
	float sec_fee2 = 6.00f;
	float sec_fee3 = 8.00f;
	float sec_fee4 = 9.00f;
	float sec_fee5 = 10.00f;
	float sec_fee6 = 11.0f;
	int dif, dif1, dif2, dif3, dif4, dif5, dif6;   // sub to unit stored
	float dif_unit,dif_unit1,dif_unit2,dif_unit3,dif_unit4,dif_unit5;  //sub to unit value mul to price 
	

	public eb_calc() {
		System.out.println("--------EB BILL---------");
	}
// input the data
	public void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("\nName = ");
		name = s.nextLine();
		System.out.print("\nReceipt no =");
		rec = s.nextInt();
		System.out.print("\nEB number = ");
		ebnum = s.nextInt();
		System.out.print("\nDate(dd-mm-yyyy) = ");
		date = s.next();
		System.out.print("\nUnit = ");
		current_unit = s.nextInt();

	}
//bill calculator
	public void bill() {
		usage_eb = current_unit;
		if (usage_eb >= fir_range && usage_eb <= fir_range4) {   //(unit>0&&unit<=500)
			if (usage_eb >= fir_range && usage_eb <= fir_range1) {   //(unit>0&&unit<=100)
				unit = usage_eb - fir_range;
				paid = unit * fir_fee;
			}
			if (usage_eb <= fir_range2 && usage_eb > fir_range1) {   //(unit>100&&unit<=200)
				unit = usage_eb - fir_range1;
				unit_price = unit * fir_fee1;
				dif = fir_range1 - fir_range;
				dif_unit = dif * fir_fee;
				paid = unit_price + dif_unit;

			}
			if (usage_eb <= fir_range3 && usage_eb > fir_range2) {  //(unit>200&&unit<=400)
				unit = usage_eb - fir_range2;
				unit_price = unit * fir_fee2;
				dif = fir_range1 - fir_range;
				dif_unit = dif * fir_fee;
				dif1 = fir_range2 - fir_range1;
				dif_unit1 = dif1 * fir_fee1;
				paid = unit_price + dif_unit1 +dif_unit;
			}
			if (usage_eb <= fir_range4 && usage_eb > fir_range3) {   //(unit>400&&unit<=500)
				unit = usage_eb - fir_range3;
				unit_price = unit * fir_fee3;
				dif = fir_range1 - fir_range;
				dif_unit = dif * fir_fee;
				dif1 = fir_range2 - fir_range1;
				dif_unit1 = dif1 * fir_fee1;
				dif2 = fir_range3 - fir_range2;
				dif_unit2 = dif2 * fir_fee2;
				paid = unit_price + dif_unit2 + dif_unit1 +dif_unit;
			}
		}
		if (usage_eb > fir_range4) {          //(unit>500)
			if (usage_eb <= sec_range4 && usage_eb > sec_range3) {  //(unit>500&&unit<=600)
				unit = usage_eb - sec_range3;
				unit_price = unit * sec_fee3;
				dif = sec_range1 - sec_range;
				dif_unit = dif * sec_fee;
				dif1 = sec_range2 - sec_range1;
				dif_unit1 = dif1 * sec_fee1;
				dif2 = sec_range3 - sec_range2;
				dif_unit2 = dif2 * sec_fee2;
				paid = unit_price + dif_unit2 + dif_unit1 + dif_unit;
			}
			if (usage_eb <= sec_range5 && usage_eb > sec_range4) {   //(unit>6000&&unit<=800)
				unit = usage_eb - sec_range4;
				unit_price = unit * sec_fee4;
				dif = sec_range1 - sec_range;
				dif_unit = dif * sec_fee;
				dif1 = sec_range2 - sec_range1;
				dif_unit1 = dif1 * sec_fee1;
				dif2 = sec_range3 - sec_range2;
				dif_unit2 = dif2 * sec_fee2;
				dif3 = sec_range4 - sec_range3;
				dif_unit3 = dif3 * sec_fee3;
				paid = unit_price + dif_unit3 + dif_unit2 + dif_unit1 + dif_unit;
			}
			if (usage_eb <= sec_range6 && usage_eb > sec_range5) {  //(unit>800&&unit<=1000)
				unit = usage_eb - sec_range5;
				unit_price = unit * sec_fee5;
				dif = sec_range1 - sec_range;
				dif_unit = dif * sec_fee;
				dif1 = sec_range2 - sec_range1;
				dif_unit1 = dif1 * sec_fee1;
				dif2 = sec_range3 - sec_range2;
				dif_unit2 = dif2 * sec_fee2;
				dif3 = sec_range4 - sec_range3;
				dif_unit3 = dif3 * sec_fee3;
				dif4 = sec_range5 - sec_range4;
				dif_unit4 = dif4 * sec_fee4;
				paid = unit_price + dif_unit4 +dif_unit3 +dif_unit2 +dif_unit1 + dif_unit;
			}
			if (usage_eb > sec_range6) {       //(unit>1000)
				unit = usage_eb - sec_range6;
				unit_price = unit * sec_fee6;
				dif_unit = dif * sec_fee;
				dif1 = sec_range2 - sec_range1;
				dif_unit1 = dif1 * sec_fee1;
				dif2 = sec_range3 - sec_range2;
				dif_unit2 = dif2 * sec_fee2;
				dif3 = sec_range4 - sec_range3;
				dif_unit3 = dif3 * sec_fee3;
				dif4 = sec_range5 - sec_range4;
				dif_unit4 = dif4 * sec_fee4;
				dif5 = sec_range6 - sec_range5;
				dif_unit5 = dif5 * sec_fee5;
				paid = unit_price + dif_unit5 + dif_unit4 + dif_unit3 + dif_unit2 + dif_unit1+ dif_unit;
			}
		}

	}

	public abstract void detail();
}
