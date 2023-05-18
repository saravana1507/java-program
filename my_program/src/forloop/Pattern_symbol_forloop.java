package forloop;

public class Pattern_symbol_forloop {

	public static void main(String[] args) {
		Pattern_symbol_forloop obj = new Pattern_symbol_forloop();
		System.out.println("-------------------");
		obj.first();
		System.out.println("-------------------");
		obj.second();
		System.out.println("-------------------");
		obj.third();
		System.out.println("-------------------");
		obj.four();
		System.out.println("-------------------");
		obj.five();
		System.out.println("-------------------");
		obj.six();
		System.out.println("-------------------");
		obj.seven();
		System.out.println("-------------------");
		obj.eight();
	}

	public void first() {
		for (int row = 1; row <= 5; row++) {
			for (int column = 1; column <= 5; column++) {
				System.out.print("$ ");
			}
			System.out.println();
		}
	}
	/*
	 * output: 
	 *  $ $ $ $ $
	 *  $ $ $ $ $ 
	 *  $ $ $ $ $ 
	 *  $ $ $ $ $ 
	 *  $ $ $ $ $
	 */

	public void second() {
		for (int row = 1; row <= 4; row++) {
			for (int column = 1; column <= 5; column++) {
				if (column % 2 == 0) {
					System.out.print("0 ");
				} else {
					System.out.print("# ");
				}

			}
			System.out.println();
		}
	}
	/*
	 * output: 
	 * # 0 # 0 # 
	 * # 0 # 0 # 
	 * # 0 # 0 # 
	 * # 0 # 0 #
	 */

	public void third() {
		for (int row = 1; row <= 4; row++) {
			for (int col = 1; col <= 5; col++) {
				if (col == 1 || col == 5) {
					System.out.print("0 ");
				} else {
					System.out.print("$ ");
				}
			}
			System.out.println();
		}
	}

	/*
	 * output: 
	 * 0 $ $ $ 0 
	 * 0 $ $ $ 0 
	 * 0 $ $ $ 0 
	 * 0 $ $ $ 0
	 */
	public void four() {
		for (int row = 1; row <= 5; row++) {
			if (row % 2 == 0) {
				for (int col = 1; col <= 5; col++) {
					System.out.print("0 ");
				}
			} else {
				for (int col = 1; col <= 5; col++) {
					System.out.print("* ");
				}
			}
			System.out.println();
		}

	}

	/*
	 * output: 
	 *    * * * * * 
	 *    0 0 0 0 0 
	 *    * * * * * 
	 *    0 0 0 0 0 
	 *    * * * * *
	 */
	public void five()
	{
		for(int row=1;row<=5;row++)
		{
			for(int col=1;col<=5;col++)
			{
				if(col==row)
				{
					System.out.print("0 ");
				}
				else
				{
					System.out.print("% ");
				}
			}
			System.out.println();
		}
	}
	/*
 output:  
 0 % % % % 
 % 0 % % % 
 % % 0 % % 
 % % % 0 % 
 % % % % 0 
	 */
public void six()
{
	for(int row=1;row<=5;row++)
	{
		for(int col=1;col<=5;col++)
		{
			if(col+row==6)
			{
				System.out.print("0 ");
			}
			else
			{
				System.out.print("% ");
			}
		}
		System.out.println();
	}
}
/* output:
 
 % % % % 0 
 % % % 0 % 
 % % 0 % % 
 % 0 % % % 
 0 % % % % 
 */
public void seven()
{
	for(int row=1;row<=5;row++)
	{
		for(int col=1;col<=5;col++)
		{
			if(row==col||row+col==6)
			{
				System.out.print("0 ");
			}
			else
			{
				System.out.print(". ");
			}
		}
		System.out.println();
	}
}
public void eight()
{int a=1;
	for(int row=4;row>0;row--)
	{
	 for(int space=1;space<row;space++)
	 {
		 System.out.print("  ");

	 }
	
	 for(int col=1;col<=a;col++)
	 {
		 System.out.print("* ");
	 }
	 a+=2;
	 System.out.println();
	}
}
}
