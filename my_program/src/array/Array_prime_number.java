package array;

import java.util.Scanner;

public class Array_prime_number {
	int size;
	int a[];

	public static void main(String[] args) {
		Array_prime_number ob = new Array_prime_number();
		Scanner s = new Scanner(System.in);
		ob.size(s);
		ob.num(s);
		int count = ob.check();
		ob.prime(count);
		s.close();
	}

	void size(Scanner s) {
	
		System.out.println("enter the size : ");
		size = s.nextInt();
		a = new int[size];
	}

	void num(Scanner s) {

		System.out.println("enter the number");
		for (int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();
		}
	}

	int check() {
		int temp[] = a;
		int length = 0;
		for (int i = 0; i < temp.length; i++) {
			int count = 0;
			for (int j = 1; j <= temp[i]; j++) {
				if (temp[i] % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				length++;
			}
		}
		return length;
	}

	void prime(int length) {
		int b[] = new int[length];
		int num = 0;
		for (int i = 0; i < a.length; i++) {
			int count1 = 0;
			for (int j = 1; j <= a[i]; j++) {
				if (a[i] % j == 0) {
					count1++;
				}
			}

			if (count1 == 2) {
				b[num] = a[i];
				num++;
			}
		}
		System.out.println("prime number");
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
		
	}
}
