package NewLogicProgram;

public class GuessProgram1 {

	int i=m();
	GuessProgram1(){
		System.out.println("construter");
	}
	int m()
	{
		System.out.println("m-method");
	return 20;
	}
	{
		System.out.println("instance block");
	}
	public static void main(String are[])
	{
		GuessProgram1 ob= new GuessProgram1();
		
	}
}
