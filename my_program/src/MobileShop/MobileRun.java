package MobileShop;

import java.util.List;
import java.util.Map;

public class MobileRun {

	
	public static void main(String[] args) {

		MobileList ob= new MobileList();
		MobileSort s= new MobileSort();
		ob.display(ob.join(ob.number( ob.mob()), ob.mob()));
		/*
		 * List<Mobile> sort=s.sort(ob.mob()); List<Mobile> sa=s.nameList(sort);
		 * s.PriceList(sa);
		 */
		s.update(ob.mob());
	}

	
}
