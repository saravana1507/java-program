package employee_details_String;

import java.util.Comparator;

public class NameSort implements Comparator
{

	public int compare(Object o1, Object o2) {
		Employee_detail ob= (Employee_detail) o1;
		Employee_detail ob1= (Employee_detail) o2;
		return ob.getName().compareTo(ob1.getName());
	}

}
