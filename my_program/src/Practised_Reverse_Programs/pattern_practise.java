package Practised_Reverse_Programs;

public class pattern_practise {

	public static void main(String[] args) {
		pattern_practise ob = new pattern_practise();
		ob.pattern();
		System.out.println();
		ob.pattern4();
		ob.pattern1();
		ob.pattern3();
		ob.pattern2();
		System.out.println();		

	}

	// normal pattern
	public void pattern() {
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j < 5; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	// left side triangle pattern
	public void pattern1() {
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	// left triangle pattern

	public void pattern2() {
		for (int i = 1; i < 5; i++) {
			for (int s = 5; s > i; s--) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	// down left triangle pattern
	public void pattern3() {
		for (int i = 1; i < 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	//down right triangle pattern
	public void pattern4() {
		for (int i = 1; i < 5; i++) {
			
			for (int s = 1; s <= i; s++) {
				System.out.print("  ");
			}for (int j = 5; j > i; j--) {
				System.out.print("* ");
			}
			
		
			System.out.println();
		}
	}

}
