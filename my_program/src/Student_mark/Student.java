package Student_mark;

import java.util.Scanner;

public abstract class Student implements State_student {
	String name, dob, school, district, state, dept;
	int num, std;
	int tamil, english, math, science, social;
	int physics, chemistry, biology, cs;
	int economics, commerce, accounts;
	int total;
	double avg;

	public void head() {
		System.out.println("         STUDENT MARKLIST---(2023)\n");
	}

	public void detail() {
		head();
		Scanner s = new Scanner(System.in);
		System.out.print("enter the  name =");
		name = s.nextLine();
		System.out.print("\nenter the Roll number =");
		num = s.nextInt();
		System.out.print("\ndate of birth (DD-MM-YYYY) =");
		dob = s.next();
		System.out.print("\nenter the school name=");
		school = s.next();
		System.out.print("\nenter the District name =");
		district = s.next();
		System.out.print("\nenter the state name =");
		state = s.next();
		System.out.print("\nenter the class (10 or 12) =");
		std = s.nextInt();
		if (std != 10 && std != 12) {
			System.out.println("please check class");
		}

	}

	public void mark() {
		detail();
		Scanner s = new Scanner(System.in);
		switch (std) {
		case 10: {
			System.out.print("\nTamil mark = ");
			tamil = s.nextInt();
			if(tamil<0||tamil>100)
			{
				System.out.println("please check mark");
				break;
			}
			System.out.print("\nEnglish mark = ");
			english = s.nextInt();
			if(english<0||english>100)
			{
				System.out.println("please check mark");
				break;
			}
			System.out.print("\nMaths mark = ");
			math = s.nextInt();
			if(math<0||math>100)
			{
				System.out.println("please check mark");
				break;
			}
			System.out.print("\nscience mark = ");
			science = s.nextInt();
			if(science<0||science>100)
			{
				System.out.println("please check mark");
				break;
			}
			System.out.print("\nsocial science mark = ");
			social = s.nextInt();
			if(social<0||social>100)
			{
				System.out.println("please check mark");
				break;
			}
			total = tamil + english + math + science + social;
			avg = total / 5;
			System.out.println("\n\nstudent data stored");
			break;

		}
		case 12: {
			System.out.print("\nwhich department (biology/computer science/arts) =");
			dept = s.nextLine();
			if (dept != "biology" && dept != "computer science" && dept != "arts") {
				System.out.println("please check department name");
			}
			switch (dept) {
			case "biology": {
				System.out.print("\nTamil mark =");
				tamil = s.nextInt();
				if(tamil<0||tamil>100)
				{
					System.out.println("please check mark");
					break;
				}
				System.out.print("\nEnglish mark =");
				english = s.nextInt();
				if(english<0||english>100)
				{
					System.out.println("please check mark");
					break;
				}
				System.out.print("\nMaths mark =");
				math = s.nextInt();
				if(math<0||math>100)
				{
					System.out.println("please check mark");
					break;
				}
				System.out.print("\nphysics mark=");
				physics = s.nextInt();
				if(physics<0||physics>100)
				{
					System.out.println("please check mark");
					break;
				}
				System.out.print("\nchemistry  mark = ");
				chemistry = s.nextInt();
				if(chemistry<0||chemistry>100)
				{
					System.out.println("please check mark");
					break;
				}
				System.out.print("\nbiology mark = ");
				biology = s.nextInt();
				if(biology<0||biology>100)
				{
					System.out.println("please check mark");
					break;
				}
				total = tamil + english + math + physics + chemistry + biology;
				avg = total / 6;
				System.out.println("\n\nstudent data stored");
				break;
			}
			case "computer science": {
				System.out.print("\nTamil mark =");
				tamil = s.nextInt();
				if(tamil<0||tamil>100)
				{
					System.out.println("please check mark");
					break;
				}
				System.out.print("\nEnglish mark =");
				english = s.nextInt();
				if(english<0||english>100)
				{
					System.out.println("please check mark");
					break;
				}
				System.out.print("\nMaths mark =");
				math = s.nextInt();
				if(math<0||math>100)
				{
					System.out.println("please check mark");
					break;
				}
				System.out.print("\nphysics mark=");
				physics = s.nextInt();
				if(physics<0||physics>100)
				{
					System.out.println("please check mark");
					break;
				}
				System.out.print("\nchemistry mark = ");
				chemistry = s.nextInt();
				if(chemistry<0||chemistry>100)
				{
					System.out.println("please check mark");
					break;
				}
				System.out.print("\ncomputer science mark = ");
				cs = s.nextInt();
				if(cs<0||cs>100)
				{
					System.out.println("please check mark");
					break;
				}
				total = tamil + english + math + physics + chemistry + cs;
				avg = total / 6;
				System.out.println("\n\nstudent data stored");
				break;
			}
			case "arts": {
				System.out.print("\nTamil mark =");
				tamil = s.nextInt();
				if(tamil<0||tamil>100)
				{
					System.out.println("please check mark");
					break;
				}
				System.out.print("\nEnglish mark =");
				english = s.nextInt();
				if(english<0||english>100)
				{
					System.out.println("please check mark");
					break;
				}
				System.out.print("\ncomputer science mark =");
				cs = s.nextInt();
				if(cs<0||cs>100)
				{
					System.out.println("please check mark");
					break;
				}
				System.out.print("\neconomics mark=");
				economics = s.nextInt();
				if(economics<0||economics>100)
				{
					System.out.println("please check mark");
					break;
				}
				System.out.print("\ncommerce mark = ");
				commerce = s.nextInt();
				if(commerce<0||commerce>100)
				{
					System.out.println("please check mark");
					break;
				}
				System.out.print("\naccountancy mark = ");
				accounts = s.nextInt();
				if(accounts<0||accounts>100)
				{
					System.out.println("please check mark");
					break;
				}
				total = tamil + english + cs + economics + commerce + accounts;
				avg = total / 6;
				System.out.println("\n\nstudent data stored");
				break;
			}
			}

		}

		}
	}

	public  abstract	 void display();
public abstract void mark_detail();

	abstract public void check();
}