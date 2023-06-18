package String;

import java.util.Scanner;

//every word first letter to change in capital letter

//string sentence to split() used to split the sentence then assign string []

//string [] first index small letter then change to capital letter 
//if first letter capital not change to assigned

public class Caps_first_letter_string {

	public static void main(String[] args) {
		Caps_first_letter_string ob = new Caps_first_letter_string();
		ob.letter();

	}

	public void letter() {

		Scanner scan = new Scanner(System.in);
		System.out.println("enter the sentence : ");
		String s = scan.nextLine();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(0) >= 97) {
				char num = s.charAt(i);
				char change = (char) (num - 32);
				s = s.replace(num, change);

			}
			if (s.charAt(i) == ' ') {
				i = i + 1;
				if (((int) s.charAt(i) >= 97)) {
					char num = s.charAt(i);
					char change = (char) (num - 32);
					s = s.replace(num, change);
				}
			}
		}
		System.out.println("change the sentence :" + s);
	}

}
