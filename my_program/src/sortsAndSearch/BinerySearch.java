package sortsAndSearch;

import java.util.Arrays;
import java.util.Scanner;

public class BinerySearch {

	public static void main(String[] args) {

		
		int a[]=new int[] {43,12,53,65,42,76,33};		
	//	System.out.println("enter the array number : ");
		Scanner scan=new Scanner(System.in);
		/*
		 * for(int i=0;i<a.length;i++) { a[i]=scan.nextInt(); }
		 */
		
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
		
		System.out.println("find the number");
		int find=scan.nextInt();
		int mid = 0,first=0;
		int last=a.length;
		boolean flag= false;
		for(int i=mid;i<a.length;i++ )
		{
			mid=(first+last)/2;
			
			if(a[mid]==find)
			{
				flag=true;
				break;
			}
			
			if(a[mid]<find)
			{
				first=mid+1;
			}
			if(a[mid]>find)
			{
				last=mid-1;
			}
		}
		
		if(flag)
		{
			System.out.println("found the number index = "+ mid);
		}
		if(!flag)
		{
			System.out.println("cannot found the number");
		}
	}
	
	

}
