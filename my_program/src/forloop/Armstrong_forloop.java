package forloop;

public class Armstrong_forloop {

	public static void main(String[] args) {
		Armstrong_forloop obj = new Armstrong_forloop();
		obj.total(371);
		obj.total(374);

	}

	public void total(int a) {
		int total = 0;
		for (int i = a; i > 0; i /= 10) {
			int n = i % 10;
			int num = n * n * n;
			total += num;
		}
		if (a == total) {
			System.out.println(a + " is a armstrong number");
		} else {
			System.out.println(a + "  is a not armstrong number");
		}
	}

}
