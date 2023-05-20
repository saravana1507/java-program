package encapsulation;
// find the number of prime number 
public class Number_primenumber {

	public static void main(String[] args) {
		Number_primenumber obj = new Number_primenumber();
		obj.prime(5);
		obj.prime(10);

	}

	public void prime(int n) {
		int a = 2;
		int total = 0;

		for (; total <= n; a++) {
			int count = 0;
			for (int i = 1; i <= a; i++) {
				if (a % i == 0) {
					count++;
				}
			}

			if (count == 2) {
				total++;
				if (total == n) {
					System.out.println(n + "th prime number is=" + a);
				}

			}

		}

	}
}