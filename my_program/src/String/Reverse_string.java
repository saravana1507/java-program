package String;

public class Reverse_string {

	public static void main(String[] args) {
		Reverse_string ob=new Reverse_string();
		ob.letter();

	}

	 public void letter()
	 {
		 String s="lufituaeb";
		 for(int i=s.length()-1;i>=0;i--)
		 {
			System.out.print(s.charAt(i));
		 }
	 }
}
