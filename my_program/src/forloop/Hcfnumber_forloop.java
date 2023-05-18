package forloop;

public class Hcfnumber_forloop {

	public static void main(String agr[])
	{
	Hcfnumber_forloop obj=new Hcfnumber_forloop();
	obj.number(6, 18);
	}
	public void number(int first,int second)
	{   int hcf=0;
		int small=first<second?second:first;
		for(int i=1;small>i;i++)
		{
			if(first%i==0 && second%i==0)
			{
				hcf=i;
			}
		}
		System.out.println("hcf number ="+hcf);
	}
}
