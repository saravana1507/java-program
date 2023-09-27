package sortsAndSearch;

import java.util.Arrays;
import java.util.Scanner;

public class BinerySearch {

	public static void main(String[] args) {

		
		int a[]=new int[7];		
		System.out.println("enter the array number : ");
		Scanner scan=new Scanner(System.in);
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=scan.nextInt();
		}
		
		System.out.println("Array is ="+Arrays.toString(a));
		
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
				{
				if(a[i]>a[j])
	      		{
	    	  	int temp=a[i];
	    	  	a[i]=a[j];
	    	  	a[j]=temp;
	        	}
			}
		
		}
		System.out.println("Sorted array is ="+Arrays.toString(a));

	}
	
	

}
