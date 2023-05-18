package saravana;

public class A_letter {

	public static void main(String[] args) {
		A_letter ob=new A_letter();
		ob.pattern();

	}
public void pattern()
{ int a=1;
	for(int row=1;row<=4;row++)
	{
		for(int space=4;space>row;space--)
		{
			System.out.print(" ");
		}
		for(int col=1;col<=a;col++)
		{
		
		System.out.print("*");
		
		}
		System.out.println();
	a+=2;
	}
}
}
