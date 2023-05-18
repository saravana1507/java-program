package whileloop;

public class Pattern_symbols {

	public static void main(String[] args) {
		Pattern_symbols obj = new Pattern_symbols();
		System.out.println("-------single line pattern-------");
		obj.first();
		System.out.println("---------assign * only 5*5 pattern--------");
		obj.second();
		System.out.println("---------assign * and 0 used 5*5 pattern--------");
		obj.third();
		System.out.println("---------first and last column assign 0 in 5*5 pattern--------");
		obj.four();
		System.out.println("---------even row assign 0 in 5*5 pattern--------");
		obj.five();
		System.out.println("--------- 5*5 pattern--------");
		obj.six();
		System.out.println("--------- 5*5 pattern--------");
		obj.seven();
		System.out.println("--------- 5*5 pattern--------");
		obj.eight();
	}

	public void first() {
		int i = 1; // single row in * ! * ! * output in the program
		while (i <= 5) {
			if (i % 2 == 0) {
				System.out.print("! ");
			} else {
				System.out.print("* ");
			}
			i++;
		}
		System.out.println();
	}

	public void second() {
		int row = 1; // assign * in 5*5 pattern program
		while (row <= 5) {
			int column = 1;
			while (column <= 5) {
				System.out.print("* ");
				column++;
			}
			System.out.println();
			row++;
		}
	}

	public void third() {
		int row = 1;
		while (row <= 5) {
			int column = 1;
			while (column <= 5) {
				if (column % 2 == 0) {
					System.out.print("^ ");
				} else {
					System.out.print("* ");
				}
				column++;
			}
			row++;
			System.out.println();
		}
	}

	public void four() {
		int row = 1;
		while (row <= 5) {
			int column = 1;
			while (column <= 5) {
				if (column == 1 || column == 5) {
					System.out.print("0 ");
				} else {
					System.out.print("* ");
				}
				column++;
			}
			row++;
			System.out.println();
		}
	}

	public void five() {
		int row = 1;
		while (row <= 5) {
			int column = 1;
			if (row % 2 == 0) {
				while (column <= 5) {
					System.out.print("0 ");
					column++;
				}
			} else {
				while (column <= 5) {
					System.out.print("* ");
					column++;
				}
			}
			row++;
			System.out.println();
		}
	}

	public void six() {
		int row = 1;
		while (row <= 5) {
			int column = 1;
			while (column <= 5) {
				if (column == row) {
					System.out.print("0 ");
				} else {
					System.out.print("* ");
				}
				column++;
			}
			row++;
			System.out.println();
		}

	}
	
	public void seven() {
		int row=1;
		while(row<=5)
		{
			int column=1;
			while(column<=5)
			{
				if(row+column==6)
				{
					System.out.print("/ ");
				}
				else
				{
					System.out.print("* ");
				}
				column++;
			}
			row++;
			System.out.println();
		}
	}
	
	public void eight()
	{
		int row=1;
		while(row<=5)
		{
			int column=1;
			while(column<=5)
			{
				if(row==column||row+column==6)
				{
					System.out.print("0 ");
				}
				else
				{
					System.out.print("  ");
				}
				column++;
			}
			row++;
			System.out.println();
		}
	}
	public void nine()
	{
		
	}
}