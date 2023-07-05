package MobileShop;

public class MobileRun {

	public static void main(String[] args) {

		MobileList ob= new MobileList();
		System.out.println(ob.mob());
		System.out.println(ob.imeinumber());
		System.out.println(ob.join(ob.imeinumber(), ob.mob()));
		
		
	}

}
