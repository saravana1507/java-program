package practise_program;
// palindrome triangle

//      1
//    2 1 2
//  3 2 1 2 3
//4 3 2 1 2 3 4

public class Pattern11 {

	public static void main(String[] args) {
		int colspace = 1;
		for (int row = 1; row < 5; row++) {
			for (int space = 6; space >= colspace; space--) {
				System.out.print(" ");
			}
			for (int col = row; col >= 1; col--) {
				System.out.print(col + " ");
			}
			for (int num = 2; num <= row; num++) {
				System.out.print(num + " ");
			}
			colspace += 2;
			System.out.println();
		}

	}

}
