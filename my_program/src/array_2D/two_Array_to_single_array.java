package array_2D;

public class two_Array_to_single_array {

	

	public static void main(String[] args) {
    two_Array_to_single_array ob=new two_Array_to_single_array();
       ob.single_aray();
       ob.sum();
	}
	
	
	
	// convert a 2D array into a single dimensional array
	public void single_aray()
	{
		int a[][]= {{5,4,3,2},{1,0,5,9},{1,1,5,2}};;
		int b[]=new int[a.length*a[0].length];
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				b[temp]=a[i][j];
				temp++;
			}
		}
		System.out.println("2D convert into single array :");
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
	}
	
	// fnd all the even element in an 5*5 matrix and save it in an array then
	//find the sum of it
	public void sum()
	{
		int a[][]= {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				if(a[i][j]%2==0)
				{
					count++;
				}
			}
		}
		int b[]=new int[count];
		int temp=0;
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				if(a[i][j]%2==0)
				{
					b[temp]=a[i][j];
				sum=sum+a[i][j];
				temp++;
				}
			}
		}
		System.out.println("\n\neven element ");
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
	System.out.println("\neven sum= "+sum);
	}
	

}
