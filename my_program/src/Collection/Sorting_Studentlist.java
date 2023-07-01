package Collection;
// sorting the elements in name or mark using the sort method in collection

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Sorting_Studentlist {

	public static void main(String[] args) {
		List<StudentList> ob = new ArrayList();
		StudentList stu1 = new StudentList("saravana", 89);
		StudentList stu2 = new StudentList("kumar", 85);
		StudentList stu3 = new StudentList("rahul", 71);
		StudentList stu4 = new StudentList("stephen", 79);
		StudentList stu5 = new StudentList("bala", 96);
		ob.add(stu1);
		ob.add(stu2);
		ob.add(stu3);
		ob.add(stu4);
		ob.add(stu5);
		System.out.println(ob);
		Scanner scan = new Scanner(System.in);
		System.out.println("\nplease enter you option (1 or 2) : ");
		int n = scan.nextInt();
		Comparator c = null;
		switch (n) {
		// sorting the name
		case 1: {

			c = (Object o1, Object o2) -> {
				StudentList a = (StudentList) o1;
				StudentList b = (StudentList) o2;
				return a.getName().compareTo(b.getName());
			};
			break;
		}

		// sorting the mark
		case 2: {

			c = (Object o1, Object o2) -> {
				StudentList a = (StudentList) o1;
				StudentList b = (StudentList) o2;
				if (a.getMark() > b.getMark()) {
					return 1;
				}
				if (a.getMark() < b.getMark()) {
					return -1;
				}

				return 0;
			};

			break;
		}

		}
		ob.sort(c);
		System.out.println(ob);
	}
}
