package lamda_expression;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


import employee_details_String.Employee_detail;
public class Employee_lambda_expression {

	public static void main(String[] args) {
		Employee_detail ob1 = new Employee_detail(1000, "saravana", 26, "java developer", 24000);
		Employee_detail ob2 = new Employee_detail(1001, "rahul", 24, "dotnet developer", 25000);
		Employee_detail ob3 = new Employee_detail(1002, "lajeem", 26, "software tester", 21000);
		Employee_detail ob4 = new Employee_detail(1004, "senthil", 23, "ui/ux developer", 23000);
		Employee_detail ob5 = new Employee_detail(1003, "kavin", 23, "java developer", 24000);
		Employee_detail emp[] = { ob1, ob2, ob3, ob4, ob5 };
		Scanner scan = new Scanner(System.in);
		System.out.println(" Before sorting :\n");
		for (Employee_detail i : emp) {
			System.out.println(i);
		}
		System.out.println("\nplease enter you option (1 to 5) : ");
		int n = scan.nextInt();
		Comparator c = null;
		
		// using to lambda expression 
		switch (n) {
		case 1: {
			c= (Object o1, Object o2)-> {
				Employee_detail a= (Employee_detail) o1;
				Employee_detail b= (Employee_detail) o2;	
				if(a.getIdnum()>b.getIdnum())
				{
					return 1;
				}
				if(a.getIdnum()<b.getIdnum())
				{
					return -1;
				}

				return 0;
			};

			break;
		}
		case 2: {
			c = (Object o1, Object o2)-> {
				Employee_detail a= (Employee_detail) o1;
				Employee_detail b= (Employee_detail) o2;
				return a.getName().compareTo(b.getName());
			};
			break;
		}
		case 3: {
			c = (Object o1, Object o2) ->{
				Employee_detail a= (Employee_detail) o1;
				Employee_detail b= (Employee_detail) o2;	
				if(a.getAge()>b.getAge())
				{
					return 1;
				}
				if(a.getAge()<b.getAge())
				{
					return -1;
				}

				return 0;
			};
			break;
		}
		case 4: {
			c = (Object o1, Object o2)-> {
				Employee_detail a= (Employee_detail) o1;
				Employee_detail b= (Employee_detail) o2;
				return a.getDesignation().compareTo(a.getDesignation());
			};
			break;
		}
		case 5: {
			c = (Object o1, Object o2) -> {
				Employee_detail a= (Employee_detail) o1;
				Employee_detail b= (Employee_detail) o2;	
				if(a.getSalary()>b.getSalary())
				{
					return 1;
				}
				if(a.getSalary()<b.getSalary())
				{
					return -1;
				}

				return 0;
			};

			break;
		}
		default: {
			System.out.println("pls enter valid option ");
		}

		}
		
		Arrays.sort(emp, c);
		for (Employee_detail i : emp) {
			System.out.println(i);
		}
	}

	

}
