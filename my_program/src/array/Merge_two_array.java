package array;

public class Merge_two_array {

	public static void main(String arg[]) {
		Merge_two_array ob = new Merge_two_array();
		ob.merge();
		ob.remove_duplicate();
	}

	void merge() {
		int a[] = { 4, 6, 7, 5, 8 };
		int b[] = { 3, 7, 9 };
		System.out.println("merging the array");
		int c[] = new int[a.length + b.length];
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}
		for (int i = 0; i < b.length; i++) {
			c[i + a.length] = b[i];
		}
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}
	}

	void remove_duplicate() {
		int a[] = { 4, 6, 7, 5, 8 };
		int b[] = { 3, 7, 9 };
		int count = 0;
		System.out.println("\n\nremove duplicate number in array");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					count++;
				}
			}
		}
		int[] c = new int[a.length + b.length - count];
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}
		int temp = a.length;
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (b[i] == a[j]) {
					break;
				}
				if (j == a.length - 1) {
					c[temp] = b[i];
					temp++;
				}
			}
		}
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}
	}
}
