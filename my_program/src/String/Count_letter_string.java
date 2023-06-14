package String;
import java.util.Scanner;
public class Count_letter_string {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
     Count_letter_string ob= new Count_letter_string();
     ob.letter(s);
     ob.letter(s);
     s.close();
	}
	
	
	//   this type using in string to convert array and count the number
	public void letter(Scanner n) {
		System.out.print(" user input to count the letter :");
		   char find=n.next().charAt(0);
		   String s=" this is payilagam , it is a velachery";
		   char letter[]=s.toCharArray();
		   int count=0;
		   for(int i=0;i<letter.length;i++)
		   {
			 if(find== letter[i])
			 {
				 count++;
			 }
		   }
		   System.out.println("count is:"+count);
	}
	
	//this type using in string method
	public void letter1(Scanner n) {
		System.out.print("user input to count the letter :");
		 char find=n.next().charAt(0);
		 String s=" this is payilagam , it is a velachery";
		   int count=0;
		   for(int i=0;i<s.length();i++)
		   {
			   if(find == s.charAt(0))
			   {
				   count++;
			   }
		   }
		   System.out.println("count is = "+count);
		
	}
}
