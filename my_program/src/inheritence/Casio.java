package inheritence;

public class Casio extends Calculator {

	public static void main(String[] args) {
		Casio obj = new Casio();
		int number = obj.addition(5,5);
		System.out.println("add total number is=  "+number);
		int sub = obj.subraction(34,21);
		System.out.println("subraction of number= "+sub);
		int mul = obj.multipication(6,8);
		System.out.println("multipication of number=  "+mul);
		int div = obj.division(30,6);
		System.out.println("divided of number = "+div);
	}

}
