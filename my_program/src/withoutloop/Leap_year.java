package withoutloop;


public class Leap_year {

	public static void main(String[] args) {
		Leap_year ob= new Leap_year();
		ob.year(2003);
		ob.year(2004);
		

	}
void year(int year)
{
	if(year%4==0)
	{
		System.out.println(year+" is a leap year");
	}
	else
	{
		System.out.println(year+" is a not leap year");
	}
}
}
