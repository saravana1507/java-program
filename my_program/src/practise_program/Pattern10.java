package practise_program;

//    1
//   2 2
//  3 3 3
// 4 4 4 4

public class Pattern10 {

	public static void main(String[] args) {
		int n=1;
		for(int row=1;row<5;row++)
		{  
	     for(int space=4;space>row;space--) {
	    	 System.out.print(" ");
	     }
	     for(int column=1;column<=n;column++) {
	    	 if(column%2!=0) {
			System.out.print(row+" ");}
	     }
	     n+=2;
	     System.out.println();
		}

	}

}
