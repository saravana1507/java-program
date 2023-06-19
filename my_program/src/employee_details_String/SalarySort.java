package employee_details_String;

import java.util.Comparator;

public class SalarySort implements Comparator {

	public int compare(Object o1, Object o2) {
		Employee_detail ob= (Employee_detail) o1;
		Employee_detail ob1= (Employee_detail) o2;	
		if(ob.getSalary()>ob1.getSalary())
		{
			return 1;
		}
		if(ob.getSalary()<ob1.getSalary())
		{
			return -1;
		}

		return 0;
	}

	
}
