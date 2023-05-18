package withoutloop;

public class Swap {
  public static void main(String arg[])
  {
	  int a=5;
	  int b=9;
	   b=a+b;
	   a=b-a;
	   b=b-a;
	   
	   
	  System.out.println("a number is ="+a);
	  System.out.println("b number is ="+b);
  }
}
