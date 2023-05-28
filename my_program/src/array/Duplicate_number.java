package array;

public class Duplicate_number {
	public static void main(String arg[])
{  Duplicate_number ob=new Duplicate_number();
	Input.size();
	Input.number();
	ob.duplicate();
	ob.duplicate_number();
	
}
	void duplicate()
	{
		for(int i=0;i<Input.a.length;i++)
		{
			for(int j=i+1;j<Input.a.length;j++)
			{
				if(Input.a[i]==Input.a[j])
				{
					System.out.println("\n\nduplicate elemnt founded");
					break;
				}
			}
		}
	}
void duplicate_number()
{
	for(int i=0;i<Input.a.length;i++)
	{
		for(int j=i+1;j<Input.a.length;j++)
		{
			if(Input.a[i]==Input.a[j])
			{
				System.out.println("\nduplicate number = "+Input.a[j]);
			}
		}
	}
}
}
