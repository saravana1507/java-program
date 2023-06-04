package array;

import java.util.Scanner;

public class Input {
	static int a[];
	static int size;

	static void size() {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the size number : ");
		size = s.nextInt();
		a = new int[size];
	}

	static void number() {
         size();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number :");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();

		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}