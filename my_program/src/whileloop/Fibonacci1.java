package whileloop;

public class Fibonacci1 
{

	public static void main(String arg[])
	{
		Fibonacci1 object=new Fibonacci1();
		object.number(5);
	}
	void number(int n)
	{
		int first=0;
		int second=1;
		if(n>=1)
		{
			System.out.println(0);
           		
		}
		if(n>=2)
		{
			System.out.println(1);
		
		}
		int count=3;
		while(count<=n)
		{
		System.out.println(first+second);
		second=first+second;
		first=second-first;
		count++;
		}
	
	}
}
