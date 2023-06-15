package array;

import java.util.Scanner;

public class Binery_search extends Input {

	public static void main(String[] args) {
		number();
		Binery_search ob = new Binery_search();
		Scanner s = new Scanner(System.in);
		ob.ascending();
		ob.binery(s);

	}

	void ascending() {
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}

		}
		System.out.println("\nascending number");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}

	void binery(Scanner s) {
		
		System.out.println("\nfind the number");
		int find = s.nextInt();
		int last = size ;
		int first = 0;
		int mid = (first + last) / 2;
		while (first < last) {
			if (a[mid] == find) {
				System.out.println(mid + " = index " + a[mid] + " = element founded");
				break;
			}
			if (a[mid] <= find) {
				first = mid + 1;
				mid = (mid + last) / 2;
			}
			if (a[mid] >= find) {
				last = mid - 1;
				mid = (mid + first) / 2;
			}
		}
	}
}
