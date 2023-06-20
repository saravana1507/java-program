package String;

// input the words to change  first letter captital
public class Caps_first_string {

	public static void main(String[] args) {
		Caps_first_string ob = new Caps_first_string();
		ob.number();
	}

	public void number() {
		String s = " India Is my country";
		String change = "";
		for (int i = 0; i < s.length(); i++) {
			int num = s.codePointAt(i);

			if (num != 32 && i == 0) {
				if (num > 97) {
					change = change + (char) (num - 32);
				}
				if (num < 97) {
					change = change + (char) (num);
				}
			} 
			else if (num == 32) {

				i = i + 1;
				int num1 = s.codePointAt(i);
				if (num1 < 97) {
					change = change + " " + (char) num1;
				}
				if (num1 > 97) {
					num1 = num1 - 32;
					change = change + " " + (char) num1;
				}
			} 
			else {
				change = change + (char) num;
			}

		}
		System.out.println("first letter caps"+change);
	}

}
