package String;

public class Asciicode {

	public static void main(String[] args) {
		Asciicode ob = new Asciicode();
		ob.aTobcaps();
		ob.aTobsmall();
		ob.letter();  

	}

	public void aTobcaps()
	{
	  for(char letter='A';letter<='Z';letter++)
	  {
		  System.out.println(letter+" ascii code ="+(int) letter);
	  }
	}

	public void aTobsmall()
	{
		System.out.println();
	  for(char letter='a';letter<='z';letter++)
	  {
		  System.out.println(letter+" ascii code ="+(int) letter);
	  }
	}

	public void letter()
	{
		System.out.println();
	  for(char letter='0';letter<='9';letter++)
	  {
		  System.out.println(letter+" ascii code ="+(int) letter);
	  }
	}
}
