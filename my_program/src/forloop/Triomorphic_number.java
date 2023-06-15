package forloop;

import java.util.Scanner;

	// input the number is triomorphic number or not
	// logic: input num : 5;  5*5*5=125 
	// input number same in the square last number is triomorphic number

public class Triomorphic_number {
		public static void main(String[] args) {
		Triomorphic_number ob= new Triomorphic_number();
		ob.number();

		}

		
		public void number() {
			Scanner s= new Scanner(System.in);
			System.out.println("enter the number : ");
			 int number=s.nextInt();
			 int n=number;
			 int divide=1;
			 for(int i=0;i<n;n/=10)
			 {
				 divide*=10;
			 }
			 int qube=number*number*number;
			 int compare=qube%divide;
			
			 if(number==compare)
			 {
				 System.out.println(number+" is a triomorphic number");
			 }
			 else
			 {
				 System.out.println(number+" is a not triomorphic number");
			 }
			s.close();
		}

}
