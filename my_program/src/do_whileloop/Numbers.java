package do_whileloop;

public class Numbers {

public static void main(String arg[])
{
	Numbers ob=new Numbers();
	System.out.println("-----natural number------");
	ob.natural(1);
	System.out.println("-----odd number------");
	ob.odd(1);
	System.out.println("-----even number------");
    ob.even(1);
	System.out.println("-----n number of even number------");
    ob.evennumber(8);
    System.out.println("-----n number of odd number------");
    ob.oddnumber(8);
}

public void natural(int a)
{
	do {
		System.out.println(a);
		a++;
	}
	while(a<11);
}


	public void odd(int n)
	{
	do {
		if(n%2!=0)
		{
			System.out.println(n);
		}
		n++;
	}
	while(n<10);
	}

	public void even(int n)
	{
	do {
		if(n%2==0)
		{
			System.out.println(n);
		}
		n++;
	}
	while(n<=10);
	}	
	
	public void evennumber(int n)
	{ 
		int increament=1;
	do {
		if(increament%2==0)
		{
			System.out.println(increament);
		 n--;
		}
		increament++;
		
	}
	while(n>0);
	}	


	public void oddnumber(int n)
	{ 
		int increament=1;
	do {
		if(increament%2!=0)
		{
			System.out.println(increament);
		 n--;
		}
		increament++;
		
	}
	while(n>0);
	}	
}