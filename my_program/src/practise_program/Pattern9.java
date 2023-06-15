package practise_program;


//    * * * * *
//    *       *
//    *       *
//    *       * 
//    * * * * *
public class Pattern9 {

	public static void main(String[] args) {
		for(int row=0;row<5;row++)
		{
			for(int column=0;column<5;column++) {
				if(row==0||column==0||row==4|| column==4)
				{
					System.out.print("* ");
				}
				if(row!=0&&column!=0&&row!=4&& column!=4)
				{
					System.out.print("  ");
				}		
			
			}
			System.out.println();
		}
	}

	
	
}
