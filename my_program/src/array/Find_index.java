package array;

import java.util.Scanner;

public class Find_index {
   static int size;
   static int number;
   int num;
   int a[];
	public static void main(String[] args) {
	Find_index  ob=new Find_index();
	ob.size();
	ob.number();
	ob.find();

	}
	void size() {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the size number : ");
		size = s.nextInt();
		a = new int[size];
		System.out.println("customer search number : ");
	   num=s.nextInt();
	}
		  
	void number() {	 
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number :");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();

		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(+a[i] + " ");
		}

	}
	
  void find()
  {
	for(int i=0;i<a.length;i++)
	{
		if(a[i]==num)
		{
			System.out.println("\n"+num+"is a present is  "+i+"th index");
			break;
		}
		if(i==a.length-1)
		{
		 System.out.println("cannot found the number");
		}
	}
	  
  }
  }
