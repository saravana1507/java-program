package polymorphism;

public class Calc {
	public int addition(int i,int j)
	{
		int total=i+j;
		System.out.println("total number = "+total);
		return total;
	}
	public int addition(int i,int j,int k)
	{
		int total=i+j+k;
		System.out.println("total number = "+total);
		return total;
	}
	public int subraction(int i,int j)
	{
		int total=i-j;
		System.out.println("total number = "+total);
		return total;
	}
	public int subraction(int i,int j,int k)
	{
		int total=i-j-k;
		System.out.println("total number = "+total);
		return total;
	}
	public int multipication(int i,int j)
	{
		int total=i*j;
		System.out.println("total number = "+total);
		return total;
	}
	public int multipication(int i,int j,int k)
	{
		int total=i*j*k;
		System.out.println("total number = "+total);
		return total;
	}
	public int division(int i,int j)
	{
		int total=i/j;
		System.out.println("total number = "+total);
		return total;
	}
}
