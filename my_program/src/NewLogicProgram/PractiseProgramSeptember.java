package NewLogicProgram;

public class PractiseProgramSeptember {

	public static void main(String arg[])
	{
		PractiseProgramSeptember ob= new PractiseProgramSeptember();
	//ob.prime();
	//ob.palindrome();
	//ob.StringPalindrome();
	//ob.factorial();
	//ob.fibonacci();
	//ob.swap();
	//ob.neon();
	//ob.armstrong();
	//ob.lcmnumber();
	//ob.hcfnumber();
	//ob.perfect();
//	ob.spynumber();
	ob.happynumber();
	}
	
	public void prime() {
		int num=10;
		int a=num;
		int count=0;
		for(int i=1;i<=a;i++)
		{
			if(a%i==0)
			{
			count++;
			}
		}
		
		if(count==2)
		{
			System.out.println(a+" = is a prime number");
		}
		else
		{
			System.out.println(a+" = is a not prime number");
		}
		
	}
	
	
	public void palindrome() {
		int a=123;
		int b=a;
		int reverse=0;
		for(int i =0;i<b;b/=10)
		{
			int different=b%10;
			reverse=reverse*10+different;
		}
		if(reverse==a)
		{
			System.out.println(a+" is a paloindrome number");
		}
		else
		{
			System.out.println(reverse+" is not a paloindrome number");
		}
		
	}
	
   public void StringPalindrome()
   {
	   String name="amma";
	   String reverse="";
	   for(int i=0;i<name.length();i++)
	   {
		   reverse=name.charAt(i)+reverse;
	   }
	   if(reverse.equals(name))
	   {
		   System.out.println(name+" is a palindrome");
	   }
	   if(!reverse.equals(name))
	   {
		   System.out.println(name+" is a not palindrome");
	   }
   }
	
	public void factorial()
	{
		int s=5;
		int count=1;
		for(int i=1;i<=s;i++)
		{
			count=count*i;
		}
		System.out.println(count);
	}
	
	public void fibonacci()
	{
		int a=0;
		int b=1;
		int sum=0;
		for(int i=0;i<5;i++)
		{
			sum=a+b;
			a=b;
			b=sum;
		}
	   System.out.println(sum);
	 }
	
	
	public void swap()
	{
	   int a=0;
	   int b=1;
	   System.out.println(" before swap number a="+a+" b="+b );
	   a=a+b;
	   b=a-b;
	   a=a-b;
	   System.out.println(" after swap number a="+a+" b="+b );
	}
	
	public void neon() {
		int a=5;
		int b=a*a;
		int count=0;
		for(int i=0;i<b;b/=10)
		{
		 int discount=b%10;
		 count+=discount;
		}
		if(a==count)
		{
			System.out.println(a+" is a neon number");
		}
		else
		{
			System.out.println(a+" is a not neon number");
		}
	}
	
	public void armstrong()
	{
		int a=1633;
		int b=a;
		int c=a;
		int count=0;
		for(int i=0;i<b;b/=10)
		{
		  count++;	
		}
		int total=0;
		for(int i=0;i<c;c/=10)
		{
		  int dif=c%10;
		  total+= Math.pow(dif, count);
		}
		if(total==a)
		{
			System.out.println(total+" is a armstromg number");
		}
		if(total!=a)
		{
			System.out.println(total+" is a not armstromg number");
		}
	}
	
	public void lcmnumber()
	{
	   
		int a=12;
		int b=34;
		int big=a>b?a:b;
		
		for(int i=big;i>0;i++)
		{
			if(i%a==0 && i%b==0)
			{
				System.out.println("lcm number = "+i);
				break;
			}
		}
	
	}

	public void hcfnumber()
	{
	   
		int a=12;
		int b=34;
		int hcf=0;
		int small=a<b?a:b;
		
		for(int i=1;small>i;i++)
		{
			if(a%i==0 && b%i==0)
			{
				hcf=i;
			}
		}
		System.out.println(hcf);
	
	}
	
	public void perfect() {
		int a=6;
		int b=a;
		int count=0;
		for(int i=1;i<b;i++)
		{
			if(b%i==0)
			{
				count+=i;
			}
		}
		
		if(a==count)
		{
			System.out.println(a+" is a perfect number");
		}
		if(a!=count)
		{
			System.out.println(count+" is a not perfect number");
		}
	}

	public void spynumber() {
		int a=124;
		int b=a;
		int count=0;
		int sum =1;
		for(int i=1;i<b;i++)
		{
			if(b%i==0)
			{
				count+=i;
				sum*=i;
			}
		}
		
		if(sum==count)
		{
			System.out.println(a+" is a spy number");
		}
		if(sum!=count)
		{
			System.out.println(a+" is a not spy number");
		}	
	}
	
	
	public void happynumber()
	{
		int a=9;
		int count=0;
		for(int i=0;i<a;)
		{  
			int dif=a%10;
			count+= Math.pow(dif , 2);
			a/=10;
			if(count>9 && a==0)
			{
				a=count;
				count=0;
			}
		}
		if(count==1)
		{
			System.out.println(count + " is happy number");
		}
		if(count!=1)
		{
			System.out.println(count + " is not happy number");
		}
	}
}
