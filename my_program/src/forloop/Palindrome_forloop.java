package forloop;

public class Palindrome_forloop {

	public static void main(String[] args) {
		Palindrome_forloop obj = new Palindrome_forloop();
		System.out.println("------------------");
		obj.number(121);
		System.out.println("------------------");
		obj.number(1123);
	}

	public void number(int i) {
		int reverse = 0;
		for (; i > 0; i /= 10) {
			int a = i % 10;
			reverse = reverse * 10 + a;
		}
		if (reverse == i) {
			System.out.println(reverse + "is a palindrome number");
		} else {
			System.out.println(reverse + " is a not palindrome number");
		}
	}
}
