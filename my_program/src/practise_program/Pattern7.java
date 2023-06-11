package practise_program;

public class Pattern7 {
   
	// 1 2 3 4 5
	// 2 3 4 5 6
	// 3 4 5 6 7
	// 4 5 6 7 8
	// 5 6 7 8 9
	public static void main(String[] args) {
		Pattern7 ob=new Pattern7();
		ob.number();

	}
	public void number() {
		
		for(int i=0;i<5;i++)
		{   	
			for(int j=0;j<5;j++)
			{
			   System.out.print((i+j)+1+" ");
			   
			}
		System.out.println();
		}
	}

}
