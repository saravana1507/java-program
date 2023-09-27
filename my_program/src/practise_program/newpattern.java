package practise_program;

public class newpattern {

	public static void main(String[] args) {
		int a=9;
       for(int i=0;i<3;i++)
       {    int b=a;
    	   for(int j=0;j<3;j++)
    	   { System.out.print(b+" ");
    		   b-=3;
    	   }
    	   System.out.println();
    	   a--;
       }
	}

}
