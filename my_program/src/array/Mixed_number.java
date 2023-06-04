package array;

public class Mixed_number {

	public static void main(String[] args) {
		
number();
	}
static void number()
{
	int[] a= {1,2,3,4,};
	int b[]= {5,6,7,8};
	int c[]=new int[a.length];
	for(int i=0;i<c.length;i++)
	{
		 c[i]=a[i]+b[i];
	
	}
	for(int i=0;i<c.length;i++)
	{
		System.out.print(c[i]+" ");
	}
}
}
	