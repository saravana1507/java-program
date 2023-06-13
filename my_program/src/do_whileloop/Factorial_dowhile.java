      package do_whileloop;

public class Factorial_dowhile {

	public static void main(String[] args) {
		Factorial_dowhile obj=new Factorial_dowhile();
		obj.factorial(5);
	}
	public void factorial(int a)
	{
		int total=1;
		do {
			total=total*a;
		    a--;
		}
		while(a>0);
		System.out.println("factorial number ="+total);
	}

}
