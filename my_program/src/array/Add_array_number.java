package array;

import java.util.Scanner;

public class Add_array_number extends Input {

	public static void main(String[] args) {
		Add_array_number ob = new Add_array_number();
		number();
		ob.add();

	}

	void add() {
		Scanner s = new Scanner(System.in);
		System.out.println("\nenter the number");
		int x = s.nextInt();
		System.out.println("choose index to change number");
		int y = s.nextInt();
		int temp = 0;
		int b[] = new int[a.length + 1];
		for (int i = 0; i < b.length; i++) {
			if (y == i) {
				b[i] = x;
				i++;
			}
			if (y != i) {
				b[i] = a[temp];
				temp++;
			}
		}
		System.out.println("add the element array");
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
	s.close();
	}
}
