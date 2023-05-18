package saravana;

public class E_letter {

	public static void main(String[] args) {
		E_letter ob=new E_letter();
		ob.pattern();

	}
public void pattern()
{
 for(int row=1;row<=5;row++)
 {
	 if(row%2!=0)
	 {
		 for(int column=1;column<=5;column++)
		 {
			 System.out.print("* ");
		 }
	 }
	 if(row%2==0)
	 {
		 for(int col=1;col<=1;col++)
		 {
			 System.out.print("* ");
		 }
	 }
	 System.out.println();
 }
}
}
