package forloop;

public class Digitnumber_forloop {

	public static void main(String[] args) {
	 Digitnumber_forloop obj=new Digitnumber_forloop();
    System.out.println("-------------------");
	 obj.digit(123);
	 System.out.println("-------------------");
	 obj.digit(3432);
	}
 public void digit(int i)
 { int count=0;
 System.out.println("assign the number = "+i);
	 for(;i>0;i/=10)
	 {
		 count++;
	 }
	 System.out.println("digit number = "+ count);
 }
 }
