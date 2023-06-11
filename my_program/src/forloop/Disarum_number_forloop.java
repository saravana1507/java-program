package forloop;
import java.util.Scanner;

// find the Disarium number or not
// logic input num=175;   split to digit square= 1+7*7+5*5*5=total
// input number and total are same is Disarium number
public class Disarum_number_forloop {

	public static void main(String[] args) {
		Disarum_number_forloop ob = new Disarum_number_forloop();
		ob.number();

	}

	public void number() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number: ");
		int n = scan.nextInt();
		int num = n;
		int num2=n;
		int count = 0;
		for (int i = 0; i < num; num /= 10) {
			count++;
		}
		int sum = 0;
       
		for (int i = 0; i < num2; num2 /= 10) {
			int count1=count;
			int product = 1;
			int digit = num2 % 10;
			while (count1> 0) {
				product = product * digit;
				count1--;
			}
			sum = sum + product;
			count--;
		}

		if (n == sum) {
			System.out.println(n + " is a disarum number");
		} else {
			System.out.println(n + " is a not disarum number");
		}
	}
}