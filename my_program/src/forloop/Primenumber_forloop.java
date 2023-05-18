package forloop;

public class Primenumber_forloop {

	public static void main(String[] args) {
		Primenumber_forloop obj = new Primenumber_forloop();
		obj.prime(16);
		obj.prime(17);
		obj.prime(-12);
	}

	public void prime(int n) {
		int count = 0;
		if (n > 1) {
			for (int i = 1; i <= n; i++) {
				if (n % i == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println(n + "= is a prime number");
			} else {
				System.out.println(n + "= is a not prime number");
			}
		} else {
			System.out.println(n + " = please asign 1 above number");
		}
	}
}
