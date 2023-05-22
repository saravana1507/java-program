package withoutloop;


public class Largest_among_n_digit {
	public static void main(String[] args) {
		Largest_among_n_digit ob=new Largest_among_n_digit();
		ob.number(21, 32, 12, 14);

	}
	void number(int num,int num1,int num2,int num3)
	{
		int a=num;
		int b=num1;
		int c=num2;
		int d=num3;
		int big=a>b?a:b;
		int bigger=big>c?big:c;
		int biggest=bigger>d?bigger:d;
		System.out.println("big number is = "+ biggest);
	}

}

