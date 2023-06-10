package array_2D;
//  second minimum and second maxmimum to find in this array
public class practise_2D_array {
	int input[] = { 12, 2, 5, 6, 10, 4 };

	public static void main(String[] args) {
		practise_2D_array ob = new practise_2D_array();
		ob.secMinMax();

	}

	public void secMinMax() {
		int temp = 0;
		for (int i = 0; i < input.length; i++) {
			for (int j = i + 1; j < input.length; j++)
				if (input[i] > input[j]) {
					temp = input[i];
					input[i] = input[j];
					input[j] = temp;
				}
		}
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}

		System.out.println("\nsecond minimum :" + input[1]);
		System.out.println("second maximum :" + input[input.length - 2]);

	}

}