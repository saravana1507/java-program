package whileloop;

public class Hcfnumber {
	public static void main(String arg[]) {
		Hcfnumber object = new Hcfnumber();
		object.number(14, 6);
	}

	public void number(int a, int b) {
		int i = 1;
		int highest = 0;
		int small = a > b ? b : a;
		while (i <= small) {
			if (a % i == 0 && b % i == 0) {
				highest = i;
			}

			i++;
		}
		System.out.println("hcf number=" + highest);
	}
}
