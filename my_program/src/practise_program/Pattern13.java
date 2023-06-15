package practise_program;

//           *
//          * *
//         * * *
//        * * * *
//         * * * 
//          * *
//           *



public class Pattern13 {

	public static void main(String[] args) {
		for(int i=1;i<=4;i++)
		{   for(int sp=4;sp>i;sp--)
		      {
			System.out.print(" ");
		      }
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
		    	 
			System.out.println();
		}
		for(int i=1;i<=3;i++)
		{   for(int sp=1;sp<=i;sp++)
		      {
			System.out.print(" ");
		      }
			for(int j=3;j>=i;j--)
			{
				System.out.print("* ");
			}
		
			System.out.println();
		}
	}

	

}
