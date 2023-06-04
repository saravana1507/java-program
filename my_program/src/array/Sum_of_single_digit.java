package array;

// user given the number to take the single digit in the array element
public class Sum_of_single_digit extends Input {

	public static void main(String[] args) {
		number();
		Sum_of_single_digit ob = new Sum_of_single_digit();
		
		ob.sorting();
		ob.digit();
	}

	//this type using for easy to sort the number
	
	
	
		void sorting() {

			for (int i = 0; i < a.length; i++) {
				int total = 0;

				for (int j = 0; j < a[i]; a[i] /= 10) {
					int digit = a[i] % 10;
					total = total + digit;

					if (total > 9 && a[i] == 0) {
						a[i] = total;
						total = 0;
					}

				}
				a[i] = total;
			}
			System.out.println("\nsorting the number :");
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i] + " ");
			}
		}
	
	
	
	// this method using one type of sorting number
	
	
	void digit() {

		for (int i = 0; i < a.length; i++) {
			int total = 0;

			for (int j = 0; j < a[i]; a[i] /= 10) {
				int digit = a[i] % 10;
				total = total + digit;

			}
			if (total < 10) {
				a[i] = total;
			}

			if (total > 9) {
				int total1 = 0;
				for (int num = 0; total > num; total /= 10) {
					int digit = total % 10;
					total1 = total1 + digit;
				}

				a[i] = total1;
			}
		}

		System.out.println("\n\n\nsort the number");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}


}
