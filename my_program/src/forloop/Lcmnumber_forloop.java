package forloop;

public class Lcmnumber_forloop {
	public static void main(String arg[]) {
		Lcmnumber_forloop obj = new Lcmnumber_forloop();
		obj.number(6, 15);
		obj.number(8,17);
	}

	public void number(int a, int b) {
		                
		for (int big = a > b ? a : b;big>0;big++) {
			if (big % a == 0 && big%b==0 ) {
		  System.out.println("lcm number =" + big);	
		  break;
			}			
		}
		
	}
}
