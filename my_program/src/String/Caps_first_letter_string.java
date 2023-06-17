package String;

import java.util.Locale;

public class Caps_first_letter_string {

	public static void main(String[] args) {
		Caps_first_letter_string ob = new Caps_first_letter_string();
		ob.letter();

	}

	public void letter() {
		String s = "india is My country";
		String letter[] = s.split(" ");
		for (int i = 0; i < letter.length; i++) {
			String a = letter[i];
			for (int j = 0; j < a.length(); j++) {
				if (j == 0) {
					int num = a.charAt(0);
					if (num < 97) {
						System.out.print((char) num);
					}
					if (num > 97) {
						num = num - 32;
						System.out.print((char) num);
					}
				}
				if (j > 0) {
					System.out.print(a.charAt(j));
				}
			}
			System.out.println();
		}

	}

}
