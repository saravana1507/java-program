package forloop;
import java.util.Scanner;

// this is pronic number
// logic is i next next number to product the  input number that is pronic number
public class Pronic_number {

	public static void main(String[] args) {
		Pronic_number ob= new Pronic_number();
		ob.number();

	}
	public void number()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number : ");
		int number=s.nextInt();
		int num=number;
		for(int i=0;i<=num/2;i++)
		{
			if(i*(i+1)==num)
			{
				System.out.println(num+" is a pronic number");
				break;
			}
			if(i==num/2)
			{
				System.out.println(num+" is a not pronic number");
			}
		}
		s.close();
	}

}
