package array;

public class Rotate_array extends Input {
	int b[];
	
	public static void main(String[] args) {
		number();
		Rotate_array ob = new Rotate_array();
		ob.rotate();
		ob.Second_rotate();
	}

	void rotate() {
		b = a;
		int temp = a[0];
		System.out.println("\nfirst rotate number");
		for (int i = 0; i < b.length; i++) {
			if (i < b.length - 1) {
				b[i] = b[i + 1];
			}
			if (i == b.length - 1)
				b[i] = temp;
		}
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
	}

	void Second_rotate() {
		int temp = b[0];
		System.out.println("\nsecond rotate number");
		for (int i = 0; i < b.length; i++) {
			if (i < b.length - 1) {
				b[i] = b[i + 1];
			}
			if (i == b.length - 1)
				b[i] = temp;
		}
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
	}
}
