package whileloop;

public class Pattern_numbers {

	public static void main(String[] args) {
		Pattern_numbers obj = new Pattern_numbers();
		System.out.println("----- 1 print in 5*5 pattern---");
		obj.first();
		System.out.println("----- 1 count print in 3*4 pattern---");
		obj.second();
		System.out.println("----- 1 to 4 return in print in 3*4 pattern---");
		obj.third();
		System.out.println("----- 1 to 4 return in print in 3*4 pattern---");
		obj.four();
		System.out.println("----- 1 to 4 return in print in 3*4 pattern---");
		obj.five();
		System.out.println("----- 1 to 4 return in print in 3*4 pattern---");
		obj.six();
	}

	public void first() {
		int row = 1;
		while (row <= 5) {
			int a = 1;
			int column = 1;
			while (column <= 5) {
				System.out.print(a + " ");
				column++;
			}
			row++;
			System.out.println();
		}
	}

	public void second() {
		int row = 1;
		int a = 1;
		while (row <= 3) {
			int column = 1;
			while (column <= 4) {
				System.out.print(a + " ");
				column++;
				a++;
			}
			row++;
			System.out.println();
		}
	}
public void third()
{
	int row = 1;
	while (row <= 3) {
		int a = 1;
		int column = 1;
		while (column <= 4) {
			System.out.print(a + " ");
			column++;
			a++;
		}
		row++;
		System.out.println();
	}
}
	public void four()
	{
		int row=1;
		while(row<=3)
		{
			int column=1;
			while(column<=4)
			{
				System.out.print(row+" ");
				column++;
			}
			row++;
			System.out.println();
		}
	}
	public void five()
	{
		int row=1;
		while(row<=4)
		{
			int column=1;
			while(column<=row)
			{
			System.out.print(column+" ");			
			column++;	
		}
		row++;
		System.out.println();
     	}
	}
	public void six()
	{
		int row=1;
		while(row<=5)
		{
			int column=1;
			int space=4;
		while(row<=space)
			{
				System.out.print("* ");
				space--;
			}
			while(column<=row)
			{
				System.out.print(column+" ");
				column++;
			}
			row++;
			System.out.println();
		}
		
	}
}

