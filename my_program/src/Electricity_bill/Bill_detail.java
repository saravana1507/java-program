package Electricity_bill;
// Eb-calculator display the bill
public class Bill_detail extends eb_calc {

	
public	void detail()
	{   System.out.println("\n\n\n\n\n-------------------------------------------------");
	System.out.println("\t--ELECTRICITY BILL RECEIPT--");
		System.out.println("-------------------------------------------------");
		System.out.println("NAME : "+name+"\t\t\tRECEIPT NO : "+rec+"\nEB NUMBER : "+ebnum+"\t\tDATE :"+date);
		System.out.println("UNIT :"+current_unit);
		System.out.println("-------------------------------------------------");
		System.out.println(" Slab\tFrom\tTo\tUnits\trate\tAmount(Rs)");
		System.out.println("-------------------------------------------------");
		if (usage_eb >fir_range&&usage_eb <= fir_range4) {  //(unit>0&&unit<=500)    
			if (usage_eb >fir_range&&usage_eb <=fir_range1 ) {   //(unit>0&&unit<=100)
				System.out.println("1\t"+fir_range+"\t"+fir_range1+"\t"+unit+"\t"+fir_fee+"\t"+unit_price);
			}
			if (usage_eb <= fir_range2 && usage_eb > fir_range1) {  //(unit>100&&unit<=200)
				System.out.println("1\t"+fir_range+"\t"+fir_range1+"\t"+dif+"\t"+fir_fee+"\t"+dif_unit);
				System.out.println("-------------------------------------------------");				
				System.out.println("2\t"+fir_range1+"\t"+fir_range2+"\t"+unit+"\t"+fir_fee1+"\t"+unit_price);

			}
			if (usage_eb <= fir_range3 && usage_eb > fir_range2) {  //(unit>200&&unit<=400)
				System.out.println("1\t"+fir_range+"\t"+fir_range1+"\t"+dif+"\t"+fir_fee+"\t"+dif_unit);
				System.out.println("-------------------------------------------------");				
				System.out.println("2\t"+fir_range1+"\t"+fir_range2+"\t"+dif1+"\t"+fir_fee1+"\t"+dif_unit1);
				System.out.println("-------------------------------------------------");				
				System.out.println("3\t"+fir_range2+"\t"+fir_range3+"\t"+unit+"\t"+fir_fee2+"\t"+unit_price);
			}
			if (usage_eb <= fir_range4 && usage_eb > fir_range3) {  //(unit>400&&unit<=500)

				System.out.println("1\t"+fir_range+"\t"+fir_range1+"\t"+dif+"\t"+fir_fee+"\t"+dif_unit);
				System.out.println("-------------------------------------------------");				
				System.out.println("2\t"+fir_range1+"\t"+fir_range2+"\t"+dif1+"\t"+fir_fee1+"\t"+dif_unit1);
				System.out.println("-------------------------------------------------");							
				System.out.println("3\t"+fir_range2+"\t"+fir_range3+"\t"+dif2+"\t"+fir_fee2+"\t"+dif_unit2);
				System.out.println("-------------------------------------------------");				
				System.out.println("4\t"+fir_range3+"\t"+fir_range4+"\t"+unit+"\t"+fir_fee3+"\t"+unit_price);
	
			}
		}
		if(usage_eb>fir_range4)  //(unit>500)
		{
		if (usage_eb <=sec_range4 && usage_eb > sec_range3) {  //(unit>500&&unit<=600)
			System.out.println("1\t"+sec_range+"\t"+sec_range1+"\t"+dif+"\t"+sec_fee+"\t"+dif_unit);
			System.out.println("-------------------------------------------------");				
			System.out.println("2\t"+sec_range1+"\t"+sec_range2+"\t"+dif1+"\t"+sec_fee1+"\t"+dif_unit1);
			System.out.println("-------------------------------------------------");							
			System.out.println("3\t"+sec_range2+"\t"+sec_range3+"\t"+dif2+"\t"+sec_fee2+"\t"+dif_unit2);
			System.out.println("-------------------------------------------------");				
			System.out.println("4\t"+sec_range3+"\t"+sec_range4+"\t"+unit+"\t"+sec_fee3+"\t"+unit_price);
		}
		if (usage_eb <=sec_range5 && usage_eb >sec_range4) {   //(unit>600&&unit<=800)
			System.out.println("1\t"+sec_range+"\t"+sec_range1+"\t"+dif+"\t"+sec_fee+"\t"+dif_unit);
			System.out.println("-------------------------------------------------");				
			System.out.println("2\t"+sec_range1+"\t"+sec_range2+"\t"+dif1+"\t"+sec_fee1+"\t"+dif_unit1);
			System.out.println("-------------------------------------------------");							
			System.out.println("3\t"+sec_range2+"\t"+sec_range3+"\t"+dif2+"\t"+sec_fee2+"\t"+dif_unit2);
			System.out.println("-------------------------------------------------");				
			System.out.println("4\t"+sec_range3+"\t"+sec_range4+"\t"+dif3+"\t"+sec_fee3+"\t"+dif_unit3);
			System.out.println("-------------------------------------------------");				
			System.out.println("5\t"+sec_range4+"\t"+sec_range5+"\t"+unit+"\t"+sec_fee4+"\t"+unit_price);
		
		}
		if (usage_eb <= sec_range6 && usage_eb > sec_range5) {    //(unit>800&&unit<=1000)
			System.out.println("1\t"+sec_range+"\t"+sec_range1+"\t"+dif+"\t"+sec_fee+"\t"+dif_unit);
			System.out.println("-------------------------------------------------");				
			System.out.println("2\t"+sec_range1+"\t"+sec_range2+"\t"+dif1+"\t"+sec_fee1+"\t"+dif_unit1);
			System.out.println("-------------------------------------------------");							
			System.out.println("3\t"+sec_range2+"\t"+sec_range3+"\t"+dif2+"\t"+sec_fee2+"\t"+dif_unit2);
			System.out.println("-------------------------------------------------");				
			System.out.println("4\t"+sec_range3+"\t"+sec_range4+"\t"+dif3+"\t"+sec_fee3+"\t"+dif_unit3);
			System.out.println("-------------------------------------------------");				
			System.out.println("5\t"+sec_range4+"\t"+sec_range5+"\t"+dif4+"\t"+sec_fee4+"\t"+dif_unit4);
			System.out.println("-------------------------------------------------");				
			System.out.println("6\t"+sec_range5+"\t"+sec_range6+"\t"+unit+"\t"+sec_fee5+"\t"+unit_price);
		}
		if (usage_eb > sec_range6) {  //(unit>1000)
			System.out.println("1\t"+sec_range+"\t"+sec_range1+"\t"+dif+"\t"+sec_fee+"\t"+dif_unit);
			System.out.println("-------------------------------------------------");				
			System.out.println("2\t"+sec_range1+"\t"+sec_range2+"\t"+dif1+"\t"+sec_fee1+"\t"+dif_unit1);
			System.out.println("-------------------------------------------------");							
			System.out.println("3\t"+sec_range2+"\t"+sec_range3+"\t"+dif2+"\t"+sec_fee2+"\t"+dif_unit2);
			System.out.println("-------------------------------------------------");				
			System.out.println("4\t"+sec_range3+"\t"+sec_range4+"\t"+dif3+"\t"+sec_fee3+"\t"+dif_unit3);
			System.out.println("-------------------------------------------------");				
			System.out.println("5\t"+sec_range4+"\t"+sec_range5+"\t"+dif4+"\t"+sec_fee4+"\t"+dif_unit4);
			System.out.println("-------------------------------------------------");				
			System.out.println("6\t"+sec_range5+"\t"+sec_range6+"\t"+dif5+"\t"+sec_fee5+"\t"+dif_unit5);
			System.out.println("-------------------------------------------------");				
			System.out.println("7\t"+sec_range6+"\t"+"above\t"+unit+"\t"+sec_fee6+"\t"+unit_price);
		}
		}
		
	
		System.out.println("-------------------------------------------------");
		System.out.println("\t\tAMOUNT :\t\tRs."+paid);
		System.out.println("-------------------------------------------------");
	}
}
