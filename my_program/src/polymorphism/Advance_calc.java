package polymorphism;

public class Advance_calc extends Calc {
public static void main(String arg[])
{
	Advance_calc ob= new Advance_calc();
	ob.addition(12, 32);
	ob.addition(32, 42, 12);
	ob.subraction(32, 12, 14);
	ob.multipication(5, 12, 16);
	ob.modulation(25, 6);
	ob.modulation(20.5f,5);
}
public int addition(int i,int j)
{
	int total=i-j;
	System.out.println("total number = "+total);
	return total;
}
public float addition(float i,float j,int k)
{
	float total=i+j+k;
	System.out.println("total number = "+total);
	return total;
}
 public float modulation(int a,int b)
 {
	 float total=a%b;
	 System.out.println("total number = "+total);
	 return total;
 }
 public double modulation(float a,int b)
 {
	 float total=a%b;
	 System.out.println("total number = "+total);
	 return total;
 }
}
