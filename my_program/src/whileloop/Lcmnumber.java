package whileloop;

public class Lcmnumber {

	public static void main(String[] args) 
	{
	  Lcmnumber obj=new Lcmnumber();
	   obj.number(6,14);
	}
	public void number(int a, int b)
	{
		int big=a>b?a:b;
	
		while(true)
		{
			if(big%a==0 && big%b==0)
		{
				System.out.println(big);
				 break;
		}
			big++;
		}
	}

}
