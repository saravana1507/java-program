package String;

//every word last letter to change in caps

//string sentence to split() used to split the sentence then assign string []

//string [] last index small letter then change to capital letter 
//if last letter capital not change to assigned

public class last_letter_caps_String {

	public static void main(String[] args) {
		last_letter_caps_String ob = new last_letter_caps_String();
		ob.word();
	}

	public void word() {
		String s = "senthil is a hero";
		System.out.println("first sentence : "+s + "\n");
		String a[] = s.split(" ");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length(); j++) {
				if ((j == a[i].length() - 1) && ((int) a[i].charAt(j) >= 97) && ((int) a[i].charAt(j) <= 122)) {
					char num = a[i].charAt(j);
					char n = (char) (num - 32);
					a[i] = a[i].replace(num, n);

				}
			}
		}
		System.out.print("change last letter caps in sentence :");
		for (String i : a) {
			System.out.print(i + " ");
		}
	}

}
