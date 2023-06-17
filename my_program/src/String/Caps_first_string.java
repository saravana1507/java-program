package String;
// input the words to change  first letter captital
public class Caps_first_string {

	public static void main(String[] args) {
		Caps_first_string ob = new Caps_first_string();
		ob.number();
	}

	public void number() {
		String s = "india Is my country";
		for (int i = 0; i < s.length(); i++) {
			int num = s.codePointAt(i);

			if (num != 32) {
				if (i == 0) {
					System.out.print((char) (num - 32));
				}
				if (i > 0) {
					System.out.print((char) num);
				}
			}
			if (num == 32) {
				System.out.print((char) num);
				i = i + 1;
				int num1 = s.codePointAt(i);
				if (num1 < 97) {
					System.out.print((char) num1);
				}
				if (num1 > 97) {
					num1 = num1 - 32;
					System.out.print((char) num1);
				}
			}

		}
	}

}
