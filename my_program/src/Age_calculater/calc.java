package Age_calculater;

import java.util.Scanner;

public class calc {

	void num() {
	    Scanner s=new Scanner(System.in);
	    System.out.println("enter the last year");
	    int lastyear=s.nextInt();
	    System.out.println("enter the current year");
	    int currentyear=s.nextInt(); 
	    int leapday=366;
	     int normalday=365;
	     int month=12;
	     int totalmonth=0;
	     int day=0;
		int year=currentyear-lastyear;
		if(year>0) {
		while(currentyear>lastyear)
		{
			if(lastyear%4==0)
			{
				day=leapday+day;
			}
			if(lastyear%4!=0)
			{
				day=normalday+day;
			}
			totalmonth=totalmonth+month;
			lastyear++;
		}
	int hours=day*24;
	int min=hours*60;
		
	System.out.println("differents of date and month and year\n");
	System.out.println(year+" years\n"+ totalmonth +" month\n"+day+" days\n"+hours+" hours\n"+min+" miniutes");
		}
		else
		{
			System.out.println("only show the positive different years");
		}
	}
	
}
