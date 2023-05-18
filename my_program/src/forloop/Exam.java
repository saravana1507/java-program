package forloop;

public class Exam {
	public static void main(String arg[])
	{
		Exam ob=new Exam();
		System.out.println("reverse the given number to prime or not"+"\n");
		ob.prime(149327);
		ob.prime(17);
		System.out.println("----------------------------------");
		System.out.println("given number split odd and even to sub the total");
		ob.sum(149327);
		System.out.println("----------------------------------");
		System.out.println("pattern in charactor");
		ob.pattern();

		
	}
  
	public void prime(int a) {
		int reverse=0;
		boolean flag =false;
		for(int n=a;n>0;n/=10)
		{
			int digit=n%10;
			reverse=reverse*10+digit;
		}
		for(int i=2;reverse/2>i;i++)
		{
			if(reverse%i==0)
			{
				flag=true;
				break;
				
			}
		}
		if(flag==true)
		{
			System.out.println(a+" =is a not prime number");
		}
		else
		{
			System.out.println(a+" = is a prime number");
		}
	}
	
	public void sum(int a)
	{ int count=0;
	int odd_total=0;
	int even_total=0;
		for(int i=a;i>0;i/=10)
		{
			int digit=i%10;
			count=count+1;
			if(count%2==0)
			{
				even_total=digit+even_total;
			}
			if(count%2!=0)
			{
				odd_total= digit+odd_total;
			}
		}
		int total =even_total-odd_total;
		System.out.println("odd of number = "+odd_total);
		System.out.println("even of number = "+even_total);
		System.out.println("sum of number = "+total);
	}
	
	public void pattern()
	{
		char letter='a';
		for(int row=1;row<=4;row++)
		{
			for(int col=1;col<=4;col++)
			{
				System.out.print(letter+" ");
			}
			letter++;
			System.out.println();
		}
	}
}
