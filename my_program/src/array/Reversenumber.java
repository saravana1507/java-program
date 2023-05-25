package array;
// input the value to reverse the program
import java.util.Scanner;
public class Reversenumber {

	public static void main(String[] args) {
	Reversenumber obj= new Reversenumber();
	obj.reverse();
	}
	
	void reverse()
	{
		Scanner s= new Scanner(System.in);
		System.out.println("enter the count number = ");
		int n= s.nextInt();
		int num[]=new int[n];
	System.out.println("enter the number = ");
		for(int i=0;i<num.length;i++)
		{
			num[i]=s.nextInt();
			
		}
		System.out.println("reverse number :");
		for(int i=n-1;i>=0;i--)
		{    
			System.out.println(num[i]);
		}
		s.close();
	}

}
