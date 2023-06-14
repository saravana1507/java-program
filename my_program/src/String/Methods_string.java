package String;

public class Methods_string{

	public static void main(String[] args) {
	Methods_string ob=new Methods_string();
	ob.letter();

	}

	public void letter() {
		String s="  Rahul is a playgod   ";
		String s1=" saravana is a good boy";
		System.out.println(s);
		 // input the word total length
		System.out.println("total length : "+s.length()); 
		// input the word to convert the uppercase
		System.out.println("uppercase : "+s.toUpperCase()); 
		// input the word to convert the lowercase
		System.out.println("lowercase : "+s.toLowerCase()); 
		// input the words to take the single letter
		System.out.println("Take the 4th letter :"+s.charAt(4));
		//input the letter to front and back space remove to output
		System.out.println("trim the letter:"+s.trim());
		// trim the letter then count value
		System.out.println("trim the letter length : "+s.trim().length());
	  // find the letter ascii value
		System.out.println("letter acsii value : "+s.codePointAt(6));
		// two string word join  to use this method
		System.out.println("two string join : "+s.concat(s1));
		//
		
		String first="30";
		String sec="16";
		System.out.println(first.compareTo(sec));
		
		System.out.println(s.contains("ay"));
		
	}
}
