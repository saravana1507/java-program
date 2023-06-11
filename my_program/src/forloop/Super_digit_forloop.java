package forloop;
import java.util.Scanner;
 
// find the super digit number
// input the number su of until single answer
// int a=178; output: 1+7+8=16 1+6=7;
public class Super_digit_forloop {

	public static void main(String[] args) {
		Super_digit_forloop ob=new Super_digit_forloop();
		ob.superDigit();

	}
	
	public void superDigit() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number: ");
		int input = scan.nextInt();
		int sum=0;
		for(int i=0;i<input;)
		{
			int digit=input%10;
			sum=sum+digit;
			input/=10;
			if(input==0) {
			if(sum>9)
			{
				input=sum;
				sum=0;
			}}
		}
		System.out.println(" super digit is = "+sum);
	}

}
