package array_2D;

import java.util.Scanner;

// a-D array to input the value column vice total value and the 2-D array to transpose value
// with second 2-D array without2D-array

public class transpose_and_columnsum {

	public static void main(String[] args) {
		transpose_and_columnsum ob = new transpose_and_columnsum();
		Scanner s = new Scanner(System.in);
		int a[][] = ob.display(s);
		ob.sum(a);
		ob.transpose(a);
		ob.transpose1(a);
	}

	// input the array value
	int[][] display(Scanner s) {
		
		System.out.println("\nenter the row value :");
		int row = s.nextInt();
		System.out.println("enter the column value :");
		int column = s.nextInt();
		int ar[][] = new int[row][column];
		System.out.println("enter the array value :");
		// insert the array value
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				ar[i][j] = s.nextInt();
			}
		}

		System.out.println("given array");
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {

				System.out.print(ar[i][j] + " ");

			}
			System.out.println();
		}
		return ar;
	}

	// column vice sum of the number
	void sum(int ar[][]) {
		System.out.println("\nsum of column value");
		for (int i = 0; i < ar[0].length; i++) {
			int sum = 0;
			for (int j = 0; j < ar.length; j++) {
				sum = sum + ar[j][i];
			}
			System.out.println((i + 1) + " column value = " + sum);
		}
	}

	// transpose the array in second variable
	void transpose(int ar[][]) {
		int br[][] = new int[ar[0].length][ar.length];
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				br[j][i] = ar[i][j];
			}
		}
		System.out.println("\ntranspose the array");

		for (int i = 0; i < br.length; i++) {
			for (int j = 0; j < br[i].length; j++) {

				System.out.print(br[i][j] + " ");

			}
			System.out.println();
		}
	}

	// transpose the value without second variable
	void transpose1(int ar[][]) {
          int a[][]= new int[ar[0].length][ar.length];
          a=ar;          
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				int temp = a[i][j];
				a[i][j] = a[j][i];
				a[j][i] = temp;
			}
		}
		System.out.println("\ntranspose the array");

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {

				System.out.print(a[j][i] + " ");

			}
			System.out.println();

		}
	}
}