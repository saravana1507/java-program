package array_2D;

//sample 2-D program initialization  of element in array and runtime of array element
import java.util.Scanner;

public class sample {

	public static void main(String[] args) {
		sample ob = new sample();
		ob.sample1();
		ob.sample2();
		ob.sample3();
	}

	void sample1() // a[5][5] input the value directly to array
	{
		int ar[][] = new int[5][5];
		int a = 1;
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				ar[i][j] = a;
				a++;
			}
		}
		System.out.println("5*5 array element :\n");
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.print(ar[i][j] + " ");
			}
			System.out.println();
		}
	}

	void sample2() 
	{
		int ar[][] = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
				{ 21, 22, 23, 24, 25 } };
		int a = 1;
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				ar[i][j] = a;
				a++;
			}
		}
		System.out.println("\n5*5 array element : \n");
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.print(ar[i][j] + " ");

			}
			System.out.println();
		}
	}

	void sample3() //runtime array value in this array
	{
		Scanner s = new Scanner(System.in);
		System.out.println("\nenter the row value :");
		int row = s.nextInt();
		System.out.println("enter the column value :");
		int column = s.nextInt();
		int ar[][] = new int[row][column];
		System.out.println("enter the array value :");
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				ar[i][j] = s.nextInt();

			}
		}
		System.out.println("\n5*5 array element : \n");
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.print(ar[i][j] + " ");

			}
			System.out.println();
		}
	}
}
