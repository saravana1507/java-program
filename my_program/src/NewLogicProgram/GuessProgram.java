package NewLogicProgram;

//logic tricks code 
// output:68;

public class GuessProgram {
	static int tally=0;
	public void put(int a,int b) {
		for(;a<10;a++)
		{
			b++;
			tally+=b;
		}
	}
}

class trail extends GuessProgram
{
	public static void main(String arg[])
	{
		int m=2,n=4;
		GuessProgram sa=new GuessProgram();
		sa.put(m,n);
		System.out.println(GuessProgram.tally);
	}

}
