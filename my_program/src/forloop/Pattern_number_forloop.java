package forloop;

public class Pattern_number_forloop {

	public static void main(String[] args) {
		Pattern_number_forloop obj = new Pattern_number_forloop();
		System.out.println("--------------------");
		obj.number();
		System.out.println("---------------------");
		obj.first();
		System.out.println("---------------------");
		obj.second();
		System.out.println("---------------------");
		obj.third();
		System.out.println("---------------------");
		obj.four();
		System.out.println("---------------------");
		obj.five();
		System.out.println("---------------------");
		obj.six();
		System.out.println("---------------------");
		obj.seven();
		System.out.println("---------------------");
		obj.eight();
		System.out.println("---------------------");
		obj.nine();


	}

	public void number() {
		for (int row = 1; row <= 4; row++) {
			for (int column = 1; column <= 4; column++) {
				System.out.print(column+" ");
			}
			System.out.println();
		}

	}
	/* output:
	 *   1 2 3 4
	 *   1 2 3 4
	 *   1 2 3 4
	 *   1 2 3 4
	 */

	public void first() {
		for (int row = 1; row <= 5; row++) {
			for (int column = 1; column <= row; column++) {

				System.out.print(column+" ");

			}
			System.out.println();
		}
	}
	/* output:
	 * 1
	 * 1 2
	 * 1 2 3
	 * 1 2 3 4
	 * 1 2 3 4 5
	 */

	public void second() {
		for (int row = 5; row >= 1; row--) {
			for (int column = 1; column <= row; column++) {
				System.out.print(column+" ");
			}
			System.out.println();
		}
	}
	/*output:
	 * 1 2 3 4 5
	 * 1 2 3 4
	 * 1 2 3
	 * 1 2
	 * 1
	 */

	public void third() {
		for (int row = 1; row <= 5; row++) {
			for (int space = 4; space >= row; space--) {
				System.out.print("_ ");
			}
			for (int column = 1; column <= row; column++) {
				System.out.print(column + " ");
			}

			System.out.println();
		}
	}
	/*output:
	 *  _ _ _ _ 1
	 *  _ _ _ 1 2
	 *  _ _ 1 2 3
	 *  _ 1 2 3 4
	 *  1 2 3 4 5
	 */

	public void four() {
		for (int row = 1; row <= 5; row++) {
			for (int space = 4; space >= row; space--) {
				System.out.print("_ ");
			}

			for (int column = 1; column <= row; column++) {

				System.out.print(row + " ");
			}

			System.out.println();
		}
	}
	/*output:
        _ _ _ _ 1
	 *  _ _ _ 2 2
	 *  _ _ 3 3 3
	 *  _ 4 4 4 4
	 *  5 5 5 5 5
	 */

	public void five() {
		for (int row = 1; row <= 5; row++) {
			for (int space = 4; space >= row; space--) {
				System.out.print("_ ");
			}
			int a = row;
			;
			for (int column = 1; column <= row; column++) {

				System.out.print(a + " ");
				a = row - column;
			}

			System.out.println();
		}

	}
   /*output:
    *  _ _ _ _  1 
	 *  _ _ _ 2 1
	 *  _ _ 3 2 1
	 *  _ 4 3 2 1
	 *  5 4 3 2 1
    */
	public void six() {
		int n = 1;
		for (int row = 5; row >= 1; row--) {
			for (int space = 5; space > row; space--) {
				System.out.print("_ ");
			}
			int a = n;
			for (int column = 1; column <= row; column++) {
				System.out.print(a + " ");
				a++;
			}
			System.out.println();
			n++;
		}
	}
/*output:
     *  1 2 3 4 5
     *  _ 2 3 4 5
     *  _ _ 3 4 5
     *  _ _ _ 4 5
     *  _ _ _ _ 5
 */

	public void seven() {
		int n = 5;
		for (int row = 1; row <= 5; row++) {
			for (int column = 1; column <= n; column++) {
				System.out.print(column + " ");
			}
			System.out.println();
			n--;
		}
	}
	/* output:
	 * 1 2 3 4 5
	 * 1 2 3 4
	 * 1 2 3
	 * 1 2
	 * 1
	 */

	public void eight() {
		for (int row = 5; row >= 1; row--) {
			for (int space = 5; space > row; space--) {
				System.out.print("_ ");
			}

			for (int column = 1; column <= row; column++) {
				System.out.print(column + " ");

			}
			System.out.println();

		}
	}
	/* output:
	 * 1 2 3 4 5
	 * _ 1 2 3 4
	 * _ _ 1 2 3
	 * _ _ _ 1 2
	 * _ _ _ _ 1
	 */
public void nine()
{

		for(int row=5;row>=1;row--){
			for(int col=1;col<=row;col++)
			{
			System.out.print(col);
			}
		for(int space=1;space<row;space++){
		System.out.print("");
		}

		System.out.println();
		}
}
}
