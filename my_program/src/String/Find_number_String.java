package String;
// find the number in string
public class Find_number_String {

	public static void main(String[] args) {
		Find_number_String ob= new Find_number_String();
		ob.number();
		

	}
	public void number()
	{
		String s=" my age is 26";
		System.out.print("The number is : ");
	    for(int i=0;i<s.length();i++)
	    {
	    	if(s.codePointAt(i)>48&& s.codePointAt(i)<57)
	    	{
	    		System.out.print(s.charAt(i));
	    	}
	    }
	}

}
