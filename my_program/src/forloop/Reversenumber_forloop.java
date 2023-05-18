package forloop;

public class Reversenumber_forloop {

	public static void main(String[] args) {
		Reversenumber_forloop obj = new Reversenumber_forloop();
		System.out.println("-------------------------");
		obj.number(154);
		System.out.println("-------------------------");
		obj.number(1245);
		System.out.println("------------------------");
		obj.number(-12);
	}

	public void number(int i) {
		System.out.println("assign number=" + i);
		int reverse = 0;
		if (i > 9) {
			for (; i > 0; i /= 10) {
				int a = i % 10;
				reverse = reverse * 10 + a;
			}
			System.out.println("reverse number= " + reverse);
		}

		else {
			System.out.println("please assign 9 above number");
		}
	}
}