package forloop;

public class Factorial_forloop {

	public static void main(String[] args) {
		Factorial_forloop obj = new Factorial_forloop();
		obj.number(5);
	}

	public void number(int n) {
		int total = 1;
		for (int i = 1; i <= n; i++) {
			total = total * i;
		}
		System.out.println("factorial number is = " + total);
	}
}