package practise_program;

public class pattern4 {

	public static void main(String[] args) {
		pattern4 obj = new pattern4();
		obj.number();

	}

	void number() {
		for (int row = 1; row <= 10; row++) {
			if (row <= 5) {
				for (int column = 5; column >= row; column--) {
					System.out.print(row + " ");
				}

			}
			if (row <= 10) {
				for (int col = 6; col <= row; col++) {
					System.out.print(row + " ");
				}
				System.out.println();
			}
		}

	}
}



//output:
//	
//	1 1 1 1 1 
//	2 2 2 2 
//	3 3 3 
//	4 4 
//	5 
//	6 
//	7 7 
//	8 8 8 
//	9 9 9 9 
//	10 10 10 10 10 
