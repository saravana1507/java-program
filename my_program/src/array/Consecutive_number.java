package array;

import java.util.Scanner;

public class Consecutive_number extends Input{
	  
		public static void main(String[] args) {
			Consecutive_number ob=new Consecutive_number();
	      number();	
			ob.check();

		}
		void check() {
			Scanner s= new Scanner(System.in);
			System.out.println("\nenter the sum number =");
			int check=s.nextInt();
			int total=0;
			int num=0;
			System.out.println("sum of the number");
			for(int i=0;i<a.length-1;i++)
			{
				total=a[i]+a[i+1];
					if(check==total)
					{ 
					   num++;
						System.out.println(i+" index element "+a[i]+" + "+(i+1)+" index element "+a[i+1]+" = "+check);
					}
			}
			if(num==0)
			{
				System.out.println("no elements to consective number");
			}
			}
}