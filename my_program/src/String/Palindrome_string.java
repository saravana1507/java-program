package String;

public class Palindrome_string {
    int j=0; 
	int i[]= {0};
	public static void main(String[] args) {
		Palindrome_string ob=new Palindrome_string();
		ob.letter();

	}
	
	public void letter()
	{ 
      int j=0;
		String s="appa";
		 String reverse="";
		 for(int i=s.length()-1;i>=0;i--)
		 {
			reverse=reverse+s.charAt(i);
			
		 }
		 if(s.equals(reverse))
		 {
			 System.out.println(s+" is a polindrome");
		 }
		 else { System.out.println(s+" is a not polindrome "); }
			
	}
	
	
}
