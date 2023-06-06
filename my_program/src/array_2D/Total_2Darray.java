package array_2D;
// 2D-array  every length total value and full array total value
import java.util.Scanner;

public class Total_2Darray {
	public static void main(String arg[])
	{
		Total_2Darray ob=new Total_2Darray();
		ob.sum();
	}
	void sum() 
	{
		Scanner s = new Scanner(System.in);
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
		System.out.println();
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				
			System.out.print(ar[i][j]+" ");

			}
			System.out.println();
		}
		// every row total value 
		System.out.println();
		for (int i = 0; i < ar.length; i++) {
			  int sum=0;
			for (int j = 0; j < ar[i].length; j++) {
				sum=sum+ar[i][j]; 
			}
			System.out.println((i+1)+" row total value = "+sum);
		}
		// full row total value
		int sum=0;
		for (int i = 0; i < ar.length; i++) {
			  
			for (int j = 0; j < ar[i].length; j++) {
				sum=sum+ar[i][j]; 
			}
		}
		System.out.println("\ntotal value = "+sum);
      }
   }
