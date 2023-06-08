package practise_program;

public class Patten1 {

	public static void main(String[] args) {
	Patten1 obj= new Patten1();
	obj.pattern();

	}
	void pattern()
	{
		for(int row=1;row<=5;row++)
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
  output:

1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 

*/