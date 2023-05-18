package whileloop;

public class Primenumber_with_boolean {
	// one number to declare the prime number or not prime number 
	//using in boolean

	public static void main(String arg[]) {
		Primenumber_with_boolean obj = new Primenumber_with_boolean();
		obj.count(25);
		obj.count(17);
		obj.count(-1);
	}

	public void count(int n) {
		int i = 2;
		boolean flag = false;
		if (n > 1) {
			while (i < n / 2) {
				if (n % i == 0) {
					flag = true;
					break;
				}
				i++;
			}
			if (flag == true) {
				System.out.println(n + "= not a prime number");
			} else {
				System.out.println(n + "= is a prime number");
			}
		}

		else {
			System.out.println(n + " = please assign positive number");
		}
	}
}
