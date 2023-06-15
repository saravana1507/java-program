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


	  void sample1()  // a[5][5] input the value directly to array
	  { int ar[][] =new int[5][5]; 
	  int a = 1; 
	  for (int i = 0; i < ar.length; i++)
	  { 
		  for (int j =0; j < ar[i].length; j++) 
		  {
			  ar[i][j] = a; a++; 
			  }
		  }
	  System.out.println("5*5 array element :\n"); 
	  for (int i = 0; i < ar.length;i++) 
	  {
	for (int j = 0; j < ar[i].length; j++)
	{
		System.out.print(ar[j][i] +" ");
		}
	System.out.println();
	}
	  }
	 
	void sample2() 
	{
		int ar[][] = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 1 }, { 1, 1, 1, 1, 1 }, { 6, 7,8,9,0 },
				{ 1, 2, 2, 4, 5 } };
		System.out.println("\n5*5 array element : \n");
		System.out.println("----\t  ----");
		for (int i = 0; i < ar.length; i++) {
			System.out.print("| "); 
			for (int j = 0; j < ar[i].length; j++) {
				System.out.print(ar[j][i] + " ");

			}
			System.out.print(" |");
			System.out.println();
		}
		System.out.println("----\t  ----");
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
		s.close();
	}

	}

