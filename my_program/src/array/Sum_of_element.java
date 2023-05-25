package array;
// input the value search the odd index and even index then sum the index
// then get the different the two odd and even index

import java.util.Scanner;

public class Sum_of_element {
	int odd_total, even_total;

	public static void main(String[] args) {
		Sum_of_element obj = new Sum_of_element();
		obj.index();
		obj.total();
		obj.sum();

	}

	void index() {
		Scanner s = new Scanner(System.in);
		System.out.print(" enter the count number :");
		int count = s.nextInt();
		int eve[] = new int[count];
		System.out.println("enter the number : ");
		for (int i = 0; i < count; i++) {
			eve[i] = s.nextInt();
		}
		for (int i = 0; i < count; i++) {
			if (i % 2 == 0) {
				System.out.println("even number = " + eve[i]);
				even_total = Math.addExact(eve[i], even_total);

			}
		}
		System.out.println();
		for (int i = 0; i < count; i++) {
			if (i % 2 != 0) {
				System.out.println("odd number = " + eve[i]);
				odd_total = Math.addExact(eve[i], odd_total);

			}

		}
		s.close();
	}

	void total() {
		System.out.println("\n" + "odd number total= " + odd_total + "\n");
		System.out.println("even number total= " + even_total + "\n");
	}

	void sum() {
		System.out.println("sum of numbers = " + Math.subtractExact(odd_total, even_total));
	}
}
