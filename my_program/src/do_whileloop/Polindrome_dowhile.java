package do_whileloop;

public class Polindrome_dowhile {

	public static void main(String[] args) {
		Polindrome_dowhile obj=new Polindrome_dowhile();
		obj.reverse(121);
		obj.reverse(123);

	}
	public void reverse(int a) {
		int b=a;
		int reverse=0;
		do {
			int digit=b%10;
			reverse=reverse*10+digit;
			b/=10;
		}
		while(b>0);
		if(a==reverse)
		{
			System.out.println(a+" = is a polindrome number");
		}
		else
		{
			System.out.println(a+" = is a not polindrome number");
		}
		
	}

}
