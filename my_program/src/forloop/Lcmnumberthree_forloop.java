package forloop;

public class Lcmnumberthree_forloop {

	public static void main(String arg[])
	{
		Lcmnumberthree_forloop obj=new Lcmnumberthree_forloop();
		obj.number(5, 15, 30);
		obj.number(5, 16, 32);
	}
	public void number(int a,int b, int c)
	{ 
		
		int small=a>b?a:b;
		for(int big=small>c?small:c;true;big++)
		{
			if(big%a==0&& big%b==0&&big%c==0)
			{
				System.out.println("lcm number = "+big);
				break;
			}
		}
	}
}
