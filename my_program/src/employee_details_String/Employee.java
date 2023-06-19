package employee_details_String;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Employee {

	public static void main(String arg[]) {
		Employee_detail ob1 = new Employee_detail(1000, "saravana", 26, "java developer", 24000);
		Employee_detail ob2 = new Employee_detail(1001, "rahul", 24, "dotnet developer", 25000);
		Employee_detail ob3 = new Employee_detail(1000, "lajeem", 26, "software tester", 21000);
		Employee_detail ob4 = new Employee_detail(1000, "senthil", 23, "ui/ux developer", 23000);
		Employee_detail ob5 = new Employee_detail(1000, "kavin", 23, "java developer", 24000);
		Employee_detail emp[] = { ob1, ob2, ob3, ob4, ob5 };
		Scanner scan = new Scanner(System.in);
		System.out.println(" before sorting");
		for (Employee_detail i : emp) {
			System.out.println(i);
		}
		System.out.println("pls enter you option ");
		int n = scan.nextInt();
		Comparator c = null;
		switch (n) {
		case 1: {
			c = new Idnum_sort();
			break;
		}
		case 2: {
			c = new NameSort();
			break;
		}
		case 3: {
			c = new AgeSort();
			break;
		}
		case 4: {
			c = new DesignationSort();
			break;
		}
		case 5: {
			c = new SalarySort();
			break;
		}
		default: {
			System.out.println("pls enter valid option");
		}

		}
		Arrays.sort(emp, c);
		for (Employee_detail i : emp) {
			System.out.println(i);
		}
	}
}
