package do_whileloop;

public class neon_dowhile {

	public static void main(String[] args) {
		neon_dowhile obj=new neon_dowhile();
		obj.neon(9);

	}
	public void neon(int a)
	{   int n=a;
		int count=0;
		int i=n*n;
		do {
		int digit=i%10;
		count=count+digit;
		i/=10;
		}
		while(i>0);
		if(a==count)
		{
			System.out.println(a+" = is a neon number");
		}
		else
		{
			System.out.println(a+" = is a not neon number");
		}
	}

}
