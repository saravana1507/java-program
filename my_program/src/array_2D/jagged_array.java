package array_2D;
import java.util.Scanner;
// jagged 2-D array  to assign the program
// 2 jagged array to sum the 3 jagged array
public class jagged_array {

	public static void main(String[] args) {
		jagged_array ob = new jagged_array();
		int a[][] = ob.jagged();
		ob.jagged_sum_2array(a);
	}
	public int[][] jagged() {
		Scanner s = new Scanner(System.in);
		int a[][] = new int[3][];
		a[0] = new int[2];
		a[1] = new int[3];
		a[2] = new int[1];
		System.out.println("enter the array");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = s.nextInt();
			}
		}
		System.out.println("\njagged array");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		return a;
	}

	void jagged_sum_2array(int a[][]) {
		Scanner s = new Scanner(System.in);
		int b[][] = new int[3][];
		b[0] = new int[2];
		b[1] = new int[3];
		b[2] = new int[1];
		System.out.println("enter the second array");
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				b[i][j] = s.nextInt();
			}
		}
		System.out.println("\njagged array");
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
		int c[][] = new int[3][];
		c[0] = new int[2];
		c[1] = new int[3];
		c[2] = new int[1];
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		System.out.println("\nsum of jagged array");
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}
}