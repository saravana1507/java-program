package NewPattern;

//output
 
// * 
//  * 
//   * 
//    * 
//   *
//  *
// *

public class Pattern2 {

	public static void main(String[] args) {
     int count=4;
		for(int i=0;i<count;i++)
		{
			for(int s=0;s<i;s++)
			{
				System.out.print("  ");
			}
			
			for(int j=0;j<=i;j++)
			{
				if(j==i) {
				System.out.print("* ");}
			}
			System.out.println();
		}
		
		for(int i=count-2;i>=0;i--)
		{
			for(int s=0;s<i;s++)
			{
				System.out.print("  ");
			}
			for(int j=0;j<=i;j++)
			{
				if(j==i) {
					System.out.print("*");}
			}
			System.out.println();
		}
	}

}
