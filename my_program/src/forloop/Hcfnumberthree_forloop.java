package forloop;

public class Hcfnumberthree_forloop {

	public static void main(String[] args) {
		Hcfnumberthree_forloop obj = new Hcfnumberthree_forloop();
		obj.number1(16, 8,27);
	}

	public void number1(int first, int second, int third) {
		int hcf = 0;
		int num = first < second ? second : first;
		int small = num > third ? third : num;
		for (int i = 1; small> i; i++) {
			if (first % i == 0 && second % i == 0 && third % i == 0) {
				hcf = i;
			}
		}
		System.out.println("hcf number =" + hcf);
	}
}
