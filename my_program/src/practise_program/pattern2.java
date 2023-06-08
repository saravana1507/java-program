package practise_program;

public class pattern2 {

	public static void main(String[] args) {
	pattern2 obj= new pattern2();
	obj.number();

	}
	void number()
	{
		for(int row=5;row>0;row--)
		{
			for(int column=1;column<=row;column++)
			{
				System.out.print(column+" ");
			}
			System.out.println();
		}
		for(int row=1;row<=5;row++)
		{
			for(int column=1; column<=row;column++)
			{
				System.out.print(column+" ");
			}
			System.out.println();
		}
	}

}


//output:
//	
//	1 2 3 4 5 
//	1 2 3 4 
//	1 2 3 
//	1 2 
//	1 
//	1 
//	1 2 
//	1 2 3 
//	1 2 3 4 
//	1 2 3 4 5 

