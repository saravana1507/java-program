package array;

import java.util.Scanner;

public class Increament_array_value {
	static int a[];
	static int size;
	int b[];

	public static void main(String[] args) {
		Increament_array_value ob = new Increament_array_value();
		ob.size();
		ob.number();
		ob.increase();
	}

	void size() {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the size number : ");
		size = s.nextInt();
		a = new int[size];
		b = new int[a.length];
	}

	void number() {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number :");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			b[i] = a[i];
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	void increase() {
		System.out.println("\nincreament the elements ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(b[i] + 1 + " ");
		}
	}

}
