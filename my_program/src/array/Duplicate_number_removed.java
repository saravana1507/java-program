package array;

public class Duplicate_number_removed {

	public static void main(String[] args) {
      Input.size();
      Input.number();
      dublicate();

	}

 static	void dublicate()
	{
		for(int i=0;i<Input.a.length;i++)
		{
			for(int j=i+1;j<Input.a.length;j++)
			{
				if(Input.a[i]==Input.a[j])
				{
				Input.a[j]= Integer.MIN_VALUE;				
				}	
			}
		}
		System.out.println("\n\nnon dublicated number ");
		for(int i=0;i<Input.a.length;i++)
	{
		if(Input.a[i]!=Integer.MIN_VALUE)
		{
			System.out.print(Input.a[i]+" ");
		}
	}
}
}
