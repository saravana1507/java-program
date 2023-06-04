package array;
//user input elements to find the repeat first non repeat element
public class Non_repeat_first_number extends Input {

	public static void main(String[] args) {

		Non_repeat_first_number ob = new Non_repeat_first_number();
		number();
		ob.non_repeat();
	}

	void non_repeat() {
		int num = 0;
		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = 0; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println("\nnon repeat first element = " + a[i]);
				num++;
				break;
			}
		}
		if (num == 0) {
			System.out.println("\nall element are repeated");
		}
	}

}
