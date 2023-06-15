package array_2D;
//two 2-d array to find the sum and sub and mul to third 2-d array

import java.util.Scanner;

public class Merge_array_math {

	public static void main(String[] args) {
	Merge_array_math ob=new Merge_array_math();
	Scanner s = new Scanner(System.in);
	 int a[][]=ob.array1(s);
	 int b[][]=ob.array2(s);
	 ob.sum(a, b);
	 ob.sub(a, b);
	 ob.mul(a, b);
	}
	// first 2-D insert value
	int[][] array1(Scanner s) 
	{
		
		System.out.println("\nenter the first row value :");
		int row = s.nextInt();
		System.out.println("enter the first column value :");
		int column = s.nextInt();
		int a[][] = new int[row][column];
		System.out.println("enter the first array value :");
		// insert the array value
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = s.nextInt();
			}
		}
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				
			System.out.print(a[i][j]+" ");

			}
			System.out.println();
		}
		return a;
}
	// second 2-D insert value
	int[][] array2(Scanner s) 
	{
		System.out.println("\nenter the second row value :");
		int row = s.nextInt();
		System.out.println("enter the second column value :");
		int column = s.nextInt();
		int b[][] = new int[row][column];
		System.out.println("enter the second array value :");
		// insert the array value
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				b[i][j] = s.nextInt();
			}
		}
		System.out.println();
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				
			System.out.print(b[i][j]+" ");

			}
			System.out.println();
		}
		return b;
}
	// two 2-D sum of value to assign third 2-D array
	void sum(int a[][],int b[][])
	{
		int c[][]= new int[a.length][a[0].length];
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				c[i][j] = a[i][j]+b[i][j];
			}
		}
		System.out.println("sum of two array elements");
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
	// two 2-D sub of value to assign third 2-D array
	void sub(int a[][],int b[][])
	{
		int c[][]= new int[a.length][a[0].length];
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				c[i][j] = a[i][j]-b[i][j];
			}
		}
		System.out.println("sub of two array elements");	
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
	// two 2-D mul of value to assign third 2-D array
	void mul(int a[][],int b[][])
	{
		int c[][]= new int[a.length][a[0].length];
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				c[i][j] = a[i][j]*b[i][j];
			}
		}
		System.out.println("mul of two array elements");
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}
