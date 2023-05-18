package forloop;

public class Sumprime_forloop {

	public static void main(String[] args) {
		Sumprime_forloop obj = new Sumprime_forloop();
		obj.sum(78);
		obj.sum(76);
	}

	public void sum(int i) {
		System.out.println("enter the number= " + i);
		int reverse = 0;
		for (; i > 0; i /= 10) {
			int a = i % 10;
			reverse = reverse + a;
		}
		int count = 0;
		for (int j = 1; j <= reverse; j++) {

			if (reverse % j == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println(" is a  prime number");

		} else {
			System.out.println(" is a not prime number");
		}

	}
}
