package String;
// string array to order the accending the letter

public class sorting_word {

	public static void main(String[] args) {
		sorting_word ob = new sorting_word();
		ob.letter();
	}

	public void letter() {
		String s[] = { "java", "html", "css", "phython" };
		for (int i = 0; i < s.length - 1; i++) {
			for (int j = i + 1; j < s.length; j++) {
				if (s[i].compareTo(s[j]) > 0) {
					String temp = s[i];
					s[i] = s[j];
					s[j] = temp;
				}
			}
		}
		System.out.println("Assending words :  ");
		for (String i : s) {
			System.out.println(i);
		}
	}
}
