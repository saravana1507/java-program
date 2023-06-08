package practise_program;

public class pattern3 {

	public static void main(String[] args) {
		pattern3 obj=new pattern3();
		obj.number();

	}

	void number()
	{
		for(int row=5;row>0;row--)
		{
			for(int column=1;column<=row;column++)
			{
				System.out.print(row+" ");
			}
			System.out.println();
		}
		for(int row=1;row<=5;row++)
		{
			for(int col=1;col<=row;col++)
			{
				System.out.print(row+" ");
			}
			System.out.println();
		}
	}
	
}


//output:
//	
//	
//	5 5 5 5 5 
//	4 4 4 4 
//	3 3 3 
//	2 2 
//	1 
//	1 
//	2 2 
//	3 3 3 
//	4 4 4 4 
//	5 5 5 5 5 

