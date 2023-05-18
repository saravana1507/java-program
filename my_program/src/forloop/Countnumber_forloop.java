package forloop;

public class Countnumber_forloop {

	public static void main(String[] args) {
		Countnumber_forloop obj = new Countnumber_forloop();
		System.out.println("-------------------");
		obj.count(3654);
		System.out.println("-------------------");
		obj.count(5438);
	}

	public void count(int i) {
		int total = 0;
		System.out.println("assign number= " + i);
		for (; i > 0; i /= 10) {
			int a = i % 10;
			total = total + a;
		}
		System.out.println("count the total number= " + total);
	}
}
