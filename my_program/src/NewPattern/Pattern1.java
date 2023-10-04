package NewPattern;

//output

// x 0 x 0 x 
// 0 x 0 x 0 
// x 0 x 0 x 
// 0 x 0 x 0 
// x 0 x 0 x 

public class Pattern1 {

	public static void main(String arg[])
	{
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
		     if((i+j)%2==0)
				{
					System.out.print("x ");
				}
				else
				{
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
	}
}
