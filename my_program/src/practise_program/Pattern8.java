package practise_program;

public class Pattern8 {

	// 5
	// 4 5
	// 3 4 5
	// 2 3 4 5 
	// 1 2 3 4 5
	
	public static void main(String[] args) {
	     Pattern8 ob=new Pattern8();
	     ob.number();

	}

	public void number() {
		for(int i=5;i>0;i--)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(i+"");
				i++;
			}
			System.out.println();
		}
	}
}
