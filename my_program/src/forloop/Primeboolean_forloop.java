package forloop;

public class Primeboolean_forloop {

	public static void main(String[] args) {
        Primeboolean_forloop obj=new Primeboolean_forloop();
        obj.numbers(18);
        obj.numbers(17);
	}
public void numbers(int n) {
	boolean flag=false;
		for (int i = 2; i <= n/2; i++) {
			if (n%i==0) {				
				flag=true;
				break;
			}
		}
		if (flag==false) {
			System.out.println(n + "= is a prime number");
		} else {
			System.out.println(n + "= is a not prime number");
		}
	}
}

