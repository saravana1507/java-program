package array;

public class secnum {

	 int arr[]= {40,30,10,50,20};

	 public static void main(String[] args) {
	  secnum ob=new secnum();
	  ob.max();
	  ob.min();

	 }
	 void max() {
	  int temp=0;
	  for(int i=0;i<arr.length;i++) {
	   for(int j=0;j<arr.length-1;j++) {
	    if(arr[i]==arr[j]) {
	     temp=arr[i];
	    }
	   }
	  }
	  System.out.println("The Second Maximum Value:"+temp);
	  
	  
	 }
	 void min() {
	  int temp=0;
	  for(int i=0;i<arr.length;i++) {
	   for(int j=i+1;j<arr.length;j++) {
	    if(arr[i]==arr[j]) {
	     temp=arr[i];
	    }
	   }
	  }
	  System.out.println("The Second Minmum Value:"+temp);
	 }

	}



