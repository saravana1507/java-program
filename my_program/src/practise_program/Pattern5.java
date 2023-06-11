package practise_program;

//  1 0 1 0 1
//  0 1 0 1 0
//  1 0 1 0 1
//  0 1 0 1 0
//  1 0 1 0 1




public class Pattern5 {

	public static void main(String[] args) {
		Pattern5 ob=new Pattern5();
		ob.number();

	}
	public void number()   
	{
		for(int i=0;i<5;i++)
		{
			for (int j=0;j<5;j++)
			{ System.out.print(((i+j)%2)+" "); }
			System.out.println();
		}
	}

}   
