package forloop;

public class Fibonacci_forloop {
	public static void main(String arg[]) {
		Fibonacci_forloop obj = new Fibonacci_forloop();
		obj.num(6);
	}

	public void num(int num) {
		System.out.println("----fibonacci number-----");
		int first = 0;
		int second = 1;

		for (int i = 1; i <= num; i++) {
			int count = first + second;
			System.out.println(count);
			first = second;
			second = count;
		}

	}
}
