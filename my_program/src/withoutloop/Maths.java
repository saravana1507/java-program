package withoutloop;

public class Maths {

	public static void main(String[] args) {
		Maths obj = new Maths();
		obj.max();
		System.out.println("-----------------------");
		obj.min();
		System.out.println("-----------------------");
		obj.abs();
		System.out.println("-----------------------");
		obj.round();
		System.out.println("-----------------------");
		obj.square();
		System.out.println("-----------------------");
		obj.cube();
		System.out.println("-----------------------");
		obj.pow();
		System.out.println("-----------------------");
		obj.signnumber();
		System.out.println("-----------------------");
		obj.ceil();
		System.out.println("-----------------------");
		obj.floor();
		System.out.println("-----------------------");
		obj.floordiv();
		System.out.println("-----------------------");
		obj.add_exact();
		System.out.println("-----------------------");
		obj.sub_exact();
		System.out.println("-----------------------");
		obj.multiple_exact();
		System.out.println("-----------------------");
		obj.increment_exact();
		System.out.println("-----------------------");
		obj.decrement_exact();
		System.out.println("-----------------------");
		obj.negative_exact();
		System.out.println("-----------------------");
		obj.rint();
		System.out.println("-----------------------");
		obj.hypod();

	}

	public void max() {
		System.out.println("max(23, 24) int max num =" + Math.max(23, 24));
		System.out.println("max(24, 700) long max num =" + Math.max(24, 700));
		System.out.println("max(5.6, 4.8) float max num =" + Math.max(5.6, 4.8));
		System.out.println("max(2.34, 2.32) double max num =" + Math.max(2.34, 2.32));
	}

	public void min() {
		System.out.println("min(45, 34) int min num =" + Math.min(45, 34));
		System.out.println("min(246, 700) long min num =" + Math.min(246, 700));
		System.out.println("min(6.6, 4.5) float min num =" + Math.min(6.6, 4.5));
		System.out.println("min(2.34, 2.72) double min num =" + Math.min(2.34, 2.72));

	}

	public void abs() {
		System.out.println("abs(-12) int abs num =" + Math.abs(-12));
		System.out.println("abs(-2122) long abs num =" + Math.abs(-2122));
		System.out.println("abs(54.5) float abs num =" + Math.abs(54.5));
		System.out.println("abs(0.00) double abs num =" + Math.abs(355.45));

	}

	public void round() {
		System.out.println("round(34.8) float round num =" + Math.round(34.8));
		System.out.println("round(45.65) double round num =" + Math.round(45.65));
	}

	public void square() {
		System.out.println("sqrt(36) double square num =" + Math.sqrt(35));
	}

	public void cube() {
		System.out.println("cbrt(64) double cube num =" + Math.cbrt(64));
	}

	public void pow() {
		System.out.println("pow(5, 3) double cube num =" + Math.pow(5, 3));
	}

	public void signnumber() {
		System.out.println("signum(-34.8) float signnumber num =" + Math.signum(-34.8));
		System.out.println("signum(45.65) double signnumber num =" + Math.signum(45.65));
	}

	public void ceil() {
		System.out.println("ceil(45.56) double ceil num =" + Math.ceil(45.56));
	}

	public void floor() {
		System.out.println("floor(34.12) double floor num =" + Math.floor(34.12));
	}

	public void floordiv() {
		System.out.println(" floorDiv(34,12) int floordivision num =" + Math.floorDiv(34, 12));
		System.out.println("floorDiv(-25,4) int floordivision num =" + Math.floorDiv(-25, 4));
		System.out.println("floorDiv(3400,12) int floordivision num =" + Math.floorDiv(3400, 12));
	}

	public void add_exact() {
		System.out.println("addExact(34, 543) int add num =" + Math.addExact(34, 543));
		System.out.println("addExact(354, -553) long add num =" + Math.addExact(354, -553));
	}

	public void sub_exact() {
		System.out.println("subtractExact(34, 543) int sub num =" + Math.subtractExact(34, 543));
		System.out.println("subtractExact(354, 53) long sub num =" + Math.subtractExact(354, 53));
	}

	public void multiple_exact() {
		System.out.println("multiplyExact(34, 3) int multiple num =" + Math.multiplyExact(34, 3));
		System.out.println("multiplyExact(32, 53) long multiple num =" + Math.multiplyExact(32, 53));
	}

	public void increment_exact() {
		System.out.println("incrementExact(45) int increment num =" + Math.incrementExact(45));
		System.out.println("incrementExact(6653) long increment num =" + Math.incrementExact(6653));
	}

	public void decrement_exact() {
		System.out.println("decrementExact(34) int decrement num =" + Math.decrementExact(34));
		System.out.println("decrementExact(3453) long decrement num =" + Math.decrementExact(3453));
	}

	public void negative_exact() {
		System.out.println("negateExact(34) int negative num =" + Math.negateExact(34));
		System.out.println("negateExact(3453) long negative num =" + Math.negateExact(3453));
	}

	public void rint() {
		System.out.println("rint(45.50) double rint num =" + Math.rint(45.50));
	}

	public void hypod() {
		System.out.println("hypot(6,8) double hypot num =" + Math.hypot(6, 8));
	}
}
