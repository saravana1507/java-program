package practise_program;

public class Pattern6 {

	// 0 1 0 1 0
	// 0 1 0 1 0
	// 0 1 0 1 0
	// 0 1 0 1 0
	// 0 1 0 1 0
	public static void main(String[] args) {
		Pattern6 ob=new Pattern6();
		ob.number();

	}
	public void number() {
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++)
			{
				System.out.print((j%2)+" ");
			}
			System.out.println();
		}
	}

}
