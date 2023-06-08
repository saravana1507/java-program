package practise_program;

public class pattern1 {

	public static void main(String[] args) {
   pattern1 obj=new pattern1();
   obj.number();

	}

	void number()
	{
		for(int row=5; row>0;row--)
		{
			for(int column=1;column<=row;column++)
			{
				System.out.print(column+" ");
			}
			System.out.println();
		}
	}
	
}


/*
 * output:
 * 
 * 1 2 3 4 5
 * 1 2 3 4 
 * 1 2 3 
 * 1 2 
 * 1
 */
	