package saravana;

public class S_letter {

	public static void main(String[] args) {
		S_letter ob=new S_letter();
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
		 if(row==2)
		 {
			for(int col=1;col<=1;col++)
			{
				System.out.print("* ");
			}
		
		 }
		 if(row==4)
		 {
			 for(int space=1;space<=4;space++)
			 {
			 System.out.print("  ");
			 }
			 for(int col=1;col<=1;col++)
			 {
				 System.out.print("* ");
			 }
			 }
		 System.out.println();
	 }
	}
}
