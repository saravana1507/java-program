package array;

import java.util.Scanner;

public class Split_number {
	int a[];
	int num;
	public static void main(String[] args) {
		Split_number ob = new Split_number();
		Scanner s = new Scanner(System.in);
		ob.input(s);
		ob.split();
	}

	void input(Scanner s) {
		
		System.out.println("enter the number");
		num = s.nextInt();
	}

	void split() {
		int temp = num;
		int count = 0;
		for (int i = 0; i < temp; temp /= 10) {
			count++;
		}
		a = new int[count];
		int index = count - 1;
		for (int i = index; i < num; num /= 10) {
			int s = num % 10;
			a[index] = s;
			index--;
		}
		System.out.println("array the number");
		for (int i = 0; i < count; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
