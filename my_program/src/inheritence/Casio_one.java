package inheritence;

public class Casio_one extends Calculator
{
	public static void main(String[] args) {
		Casio_one obj = new Casio_one();
		int number = obj.addition(5,5);
		System.out.println("--------------------------");
		System.out.println("add total number is=  "+number);
		int sub = obj.subraction(34,21);
		System.out.println("--------------------------");
		System.out.println("subraction of number= "+sub);
		int mul = obj.multipication(6,8);
		System.out.println("--------------------------");
		System.out.println("multipication of number=  "+mul);
		int div = obj.division(30,6);
		System.out.println("--------------------------");
		System.out.println("divided of number = "+div);
		int mod = obj.module(35,6);
		System.out.println("--------------------------");
		System.out.println("modulation of number = "+mod);
	}
	public int module(int a,int b)
	{
		int mod=a%b;
		return mod;
	}
}
