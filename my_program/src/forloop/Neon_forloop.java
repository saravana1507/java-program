package forloop;

public class Neon_forloop {

	public static void main(String[] args) {
		Neon_forloop obj = new Neon_forloop();
		obj.number(9);
		obj.number(7);
	}

	public void number(int n) {
		int i=n;
		int count = 0;
		for (int square = n * n; square > 0; square /= 10) {
			int a = square % 10;
			count=count + a;
		}
		if (i == count) {
			System.out.println(n + " = is a neon number");
		} else {
			System.out.println(n + " =  is a not neon number");
		}
	}
}
