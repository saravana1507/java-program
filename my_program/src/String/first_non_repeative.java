package String;
// first non repeative letter
public class first_non_repeative {

	public static void main(String[] args) {
		first_non_repeative ob = new first_non_repeative();
		ob.letter();

	}

	public void letter() {
		String s = " i am watiching leo";
		int count = 0;
		for (int i = 0; i < s.length() - 1; i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j) && s.charAt(i) != ' ') {
					count++;
					break;
				}
			}
			if (count > 1) {
				System.out.println("first non "
						+ "repeat letter : " + s.charAt(i));
				break;
			}
		}
	}
}
