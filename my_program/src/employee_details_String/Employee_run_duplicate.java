package employee_details_String;

// runtime input value to find duplicate cannot assign array

import java.util.Scanner;

public class Employee_run_duplicate {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the worker size :");
		int size = scan.nextInt();
		Employee_detail[] count = new Employee_detail[size];
		for (int i = 0; i < count.length; i++) {
			System.out.println("enter the id number :");
			int num = scan.nextInt();
			scan.nextLine();
			System.out.println("enter the name :");
			String name = scan.nextLine();
			System.out.println("enter the age :");
			int age = scan.nextInt();
			System.out.println("enter the designation :");
			String designation = scan.nextLine();
			scan.nextLine();
			System.out.println("enter the salary :");
			int salary = scan.nextInt();
			boolean flag = false;
            Employee_detail ob = new Employee_detail(num, name, age, designation, salary);
			for (int j = 0; j <= i; j++) {
				if (ob.equals(count[j])) {
					flag = true;
				}
			}
			if (flag == false ) {
				count[i] = ob;
			}
		}
		System.out.println();
		for(Employee_detail i:count)
		{ if(i!=null)
			System.out.println(i);
		}

	}

	
}
