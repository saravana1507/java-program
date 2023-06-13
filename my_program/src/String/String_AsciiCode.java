package String;

public class String_AsciiCode {

	public static void main(String[] args) {
		String_AsciiCode ob = new String_AsciiCode();
		String s = ob.ascii();
		ob.small(s);
		ob.number();

	}

	public String ascii() {
		String letter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for (int i = 0; i < letter.length(); i++) {
			int n = letter.charAt(i);
			System.out.println((char) n + " ascii code = " + n);

		}
		return letter;

	}

	public void small(String s) {
		System.out.println();
		String small = s.toLowerCase();
		for (int i = 0; i < small.length(); i++) {
			int n = small.charAt(i);
			System.out.println((char) n + " ascii code = " + n);
		}
	}

	public void number() {
		String num = "0123456789";
		System.out.println();
		for (int i = 0; i < num.length(); i++) {
			int n = num.charAt(i);
			System.out.println((char) n + " ascii code = " + n);
		}

	}
}
