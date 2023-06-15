package forloop;
import java.util.Scanner;
// input the number is morphic number or not
// logic: input num : 76;  76*76=5776  
// input number same in the square last number is morphic number


public class morphic_number {

	public static void main(String[] args) {
	morphic_number ob= new morphic_number();
	ob.number();

	}

	
	public void number() {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the number : ");
		 int number=s.nextInt();
		 int n=number;
		 int divide=1;
		 for(int i=0;i<n;n/=10) {		 
			 divide*=10;
		 }
		 int square=number*number;
		 int compare=square%divide;	
		 
		 if(number==compare)
		 {
			 System.out.println(number+" is a morphic number");
		 }
		 else
		 {
			 System.out.println(number+" is a not morphic number");
		 }
		s.close();
	}
	
}
