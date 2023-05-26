package array;

// student age program. count the student age and input age and
// total age and average  the program
import java.util.Scanner;

public class Student {
	int n;
	float total;
	float avg;

	public static void main(String[] args) {
		Student obj = new Student();
		obj.student_age();
		obj.avg();

	}

	void student_age() {

		Scanner s = new Scanner(System.in);
		System.out.print("Enter The Size of Students : ");
		n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the Student Age : ");
		for (int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();
			total = a[i] + total;

		}
		System.out.println();
		System.out.print("Students Age :  ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.println("Student Total Age : " + total);
		s.close();
	}

	void avg() {
		avg = total / n;
		System.out.println("Student Average Age : " + avg);
	}

}
