package String;

import java.util.Arrays;
// sorting string in this program using predefined method

public class Sort_String {

	public static void main(String[] args) {
		Sort_String ob= new Sort_String();
		ob.letter();

	}
	public void letter()
	{
		String[] s= {"rahul","sethil","saravana","kavin"};
		Arrays.sort(s);
		for(String i:s) 
		System.out.println(i);
	
	}
	public void word()
	{
		
	}

}
