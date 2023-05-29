package Student_mark;

import java.util.Scanner;

public class Student_display extends Student {

	public void display() {

		System.out.println("\n\n\n\n-------------------------------------------------------");
		System.out.println("-----------------------STUDENT MARK LIST----------------");
		System.out.println("---------------------------------------------------------");
		System.out.print("Student Name = " + name + "\t\tStudent Roll Number = " + num + "\nDate Of Birth = " + dob
				+ "\t\tSchool name = " + school + "\n");
		System.out.print("District  = " + district + "\t\tState = " + state + "\nClass =" + std);
	}


	public void mark_detail() {
		display();
		switch (std) {

		case 10: {
			System.out.println("\n-----------------------------------");
			System.out.println("  SUBJECT\t\tMARK ");
			System.out.println("-----------------------------------");
			System.out.println("\nTamil mark =\t\t" + tamil + "\nEnglish mark  =\t\t" + english + "\nMaths mark = \t\t"
					+ math + "\nScience mark =\t\t" + science + "\nSocial mark =\t\t" + social);
			System.out.println("-----------------------------------");
			System.out.println("total =                " + total + "\n-----------------------------------"
					+ "\navarage =               " + avg + "%");
			if (tamil > 34 && english > 34 && math > 34 && science > 34 && social > 34) {
				System.out.println("-----------------------------------");
				System.out.println("Result                   PASS");
				System.out.println("-----------------------------------");
			} else {
				System.out.println("-----------------------------------");
				System.out.println("Result                    FAIL");
				System.out.println("-----------------------------------");
			}
			break;
		}
		case 12: {
			if (dept == "biology" && dept == "computer science" && dept == "arts")
				switch (dept) {

				case "biology": {
					System.out.print("\t\t\tdepartment=" + dept);
					System.out.println("\n-----------------------------------");
					System.out.println("  SUBJECT               MARK ");
					System.out.println("-----------------------------------");
					System.out.println("\nTamil mark = \t\t" + tamil + "\nEnglish mark  =\t\t" + english
							+ "\nMaths mark =\t\t" + math + "\nPhysics mark =\t\t" + physics + "\nChemistry mark =\t"
							+ chemistry + "\nBiology mark =\t\t" + biology);
					System.out.println("-----------------------------------");
					System.out.println("total =                " + total + "\n-----------------------------------"
							+ "\navarage =              " + avg + "%");

					if (tamil > 34 && english > 34 && math > 34 && physics > 34 && chemistry > 34 && biology > 34) {
						System.out.println("-----------------------------------");
						System.out.println("Result                 PASS");
						System.out.println("-----------------------------------");
					} else {
						System.out.println("-----------------------------------");
						System.out.println("Result                  FAIL");
						System.out.println("-----------------------------------");
					}
					break;
				}
				case "computer science": {
					System.out.print("\t\tdepartment=" + dept);
					System.out.println("\n-----------------------------------");
					System.out.println("  SUBJECT               MARK ");
					System.out.println("-----------------------------------");

					System.out.println("\nTamil mark =\t\t" + tamil + "\nEnglish mark  =\t\t" + english
							+ "\nMaths mark =\t\t" + math + "\nPhysics mark =\t\t" + physics
							+ "\nChemistry mark =           " + chemistry + "\nComputer Science mark =   \t" + cs);
					System.out.println("-----------------------------------");
					System.out.println("total =                  " + total + "\n-----------------------------------"
							+ "\navarage =               " + avg + "%");

					if (tamil > 34 && english > 34 && math > 34 && physics > 34 && chemistry > 34 && cs > 34) {
						System.out.println("-----------------------------------");
						System.out.println("Result                   PASS");
						System.out.println("-----------------------------------");
					} else {
						System.out.println("-----------------------------------");
						System.out.println("Result                   FAIL");
						System.out.println("-----------------------------------");
					}
					break;
				}
				case "arts": {
					System.out.print("\t\tdepartment=" + dept);
					System.out.println("\n-----------------------------------");
					System.out.println("  SUBJECT               MARK ");
					System.out.println("-----------------------------------");

					System.out.println("\nTamil mark =\t\t" + tamil + "\nEnglish mark  =\t\t" + english
							+ "\nComputer science mark =\t" + cs + "\nEconomics mark =\t" + economics
							+ "\nCommerce mark =\t\t" + commerce + "\nAccounts mark =\t\t" + accounts);
					System.out.println("-----------------------------------");
					System.out.println("total =                 " + total + "\n-----------------------------------"
							+ "\navarage =              " + avg + "%");

					if (tamil > 34 && english > 34 && cs > 34 && economics > 34 && commerce > 34 && accounts > 34) {
						System.out.println("-----------------------------------");
						System.out.println("Result                    PASS");
						System.out.println("-----------------------------------");
					} else {
						System.out.println("\n-----------------------------------");
						System.out.println("Result                      FAIL");
						System.out.println("-----------------------------------");
					}
					break;
				}
				}
		}

		}
	}

	public void check() {
		Scanner s = new Scanner(System.in);
		System.out.print("\n\n  if you again insert or view details  (yes/no) = ");
		String x = s.nextLine();
		switch (x) {
		case "yes": {
			System.out.print("which you want (input marklist or view marklist) = ");
			String n = s.nextLine();
			switch (n) {
			case "input marklist": {
				mark();
				check();
				break;
			}
			case "view marklist": {
				mark_detail();
				check();
				break;
			}
			}

		}
		case "no": {
			System.out.println("\n\n       -----thank you------");
		}
		}
	}
}
