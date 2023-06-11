package forloop;

import java.util.Scanner;

public class Happy_number_forloop {

	public static void main(String[] args) {
		Happy_number_forloop ob = new Happy_number_forloop();
		ob.number();

	}

	public void number() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number: ");
		int input = scan.nextInt();
		int n = input;
		int num = 1;
		int count = 2;
		for (int i = 0; i < n;) {
			int digit = n % 10;
			n /= 10;
			while (count > 0) {
				num = num * digit;
				count--;
			}
			if (num > 9) {
				n = num;
				num = 1;
			}
		}
		if (num == 1) {
			System.out.println(input + " is a happy number");
		} else {
			System.out.println(input + " is a not happy number");
		}
	}

}
