package array;

import java.util.Scanner;

public class Adcency_array extends Input {

	public static void main(String[] args) {
		Adcency_array ob = new Adcency_array();
		number();
		ob.adcency();

	}

	void adcency() {
		System.out.println("\nfind the number");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		boolean flag = false;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == n && i != 0 && i != a.length - 1) {
				flag = true;
				System.out.println(a[i - 1] + " before number and " + a[i + 1] + " after number");
			}
			if (a[i] == n && i == 0 && i != a.length - 1) {
				flag = true;
				System.out.println("before no number and " + a[i + 1] + " after number");
			}
			if (a[i] == n && i != 0 && i == a.length - 1) {
				flag = true;
				System.out.println(a[i - 1] + " before number and after no number");
			}
			if (flag = false) {
				System.out.println("cannot found the number");
			}
		}

	}

}
