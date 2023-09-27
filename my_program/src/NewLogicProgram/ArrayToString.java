package NewLogicProgram;

public class ArrayToString {

	public static void main(String[] args) {
		String name="SaravanaKumar";
		char myname[]=new char[name.length()];
		
	    for(int i=0;i<name.length();i++)
	    {
	    	myname[i]=name.charAt(i);
	    	
	    }
	    for (int i=0;i<myname.length;i++)
	    {
	    	System.out.print(myname[i]);
	    }
	}

}
