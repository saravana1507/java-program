package whileloop;

public class Primenumber {

	public static void main(String[] args) {
		Primenumber obj = new Primenumber();
		obj.number(0);
		obj.number(-3);

	}

	public void number(int number) {
		int count = 0;
		if (number >= 0) {
			while (count < 15) {
				int i = 1;
				int div = 0;
				while (number >= i) {
					if (number % i == 0) {
						div++;
					}
					i++;
				}
				if (div == 2) {
					System.out.println("prime numbers : " + number);
					count++;
				}
				number++;
			}
		}

		else {
			System.out.println("please check number");
		}
	}
}
