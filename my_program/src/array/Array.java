package array;
import java.util.Scanner;
public class Array {
	 int arr[];
	 int size;
	 

	 public static void main(String[] args) {
	 Array ob=new Array();
	 ob.aggregate();
	 ob.rmv_duplicate();

	 }
	 public void aggregate() {
	  Scanner s=new Scanner(System.in);
	  System.out.println("Enter the Element");
	 int size=s.nextInt();
	 int arr[]=new int[size];
	 System.out.println("enter values:");
	 for(int i=0;i<arr.length;i++) {
	  arr[i]=s.nextInt();
	 }
	 int max=Integer.MIN_VALUE;
	 
	 int s_max=0;

	  for(int i=1;i<arr.length;i++) {
	      if(arr[i]>max) {
	    s_max=max;
	    max=arr[i];
	   }
	   
	  }
	  System.out.println("The  Maximum Element:"+max);
	  System.out.println("The Second Maximum Element:"+s_max);
	 }
	 public void rmv_duplicate() {
	    int temp[] = new int[size];  
	         int j = 0; 
	         int i;
	         for (i=0; i<arr.length-1; i++){  
	             if (arr[i] != arr[i+1]){  
	                 temp[j++] = arr[i];  
	             }  
	          } 
	         temp[j++] = arr[size-1];     
	         
	         for ( i=0; i<j; i++){  
	             arr[i] = temp[i];  
	         }  
	         for ( i=0; i<arr.length; i++)  {
	         System.out.println("After Remove the Duplicate Element:"+arr[i]);
	 }
	 }
}
