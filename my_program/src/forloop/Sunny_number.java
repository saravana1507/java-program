package forloop;
import java.util.Scanner;

// this is sunny number
// input the number to add 1 and that number is find the squared number
// if true that is sunny number

public class Sunny_number {

	public static void main(String[] args) {
		Sunny_number ob=new Sunny_number();
		ob.number();

	}
	public void number()
	{
		Scanner s= new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num=s.nextInt();
		int find=num+1;
		for(int i=0;i<=find/2;i++) {
			if(i*i==find)
			{
				System.out.println(num+" is a sunny number");
				break;
			}
			if(i==find/2)
			{
				System.out.println(num +" is a not sunny number");
				break;
			}
		}
	s.close();	
	}

}
