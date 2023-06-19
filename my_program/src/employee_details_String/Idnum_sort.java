package employee_details_String;

import java.util.Comparator;

public class Idnum_sort implements Comparator  {

	
	public int compare(Object o1, Object o2) {
		Employee_detail ob= (Employee_detail) o1;
		Employee_detail ob1= (Employee_detail) o2;	
		if(ob.getIdnum()>ob1.getIdnum())
		{
			return 1;
		}
		if(ob.getIdnum()<ob1.getIdnum())
		{
			return -1;
		}

		return 0;
	}

}
