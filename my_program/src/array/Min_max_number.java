package array;
// input the number in array find the maximum number and minimum number
import java.util.Scanner;

public class Min_max_number {
	int a[];
	static int size;
	static int number;

	public static void main(String[] args) {
		Min_max_number ob = new Min_max_number();
		ob.size();
		ob.number();
		ob.min();
		ob.max();

	}

	void size() {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the size number : ");
		size = s.nextInt();
		a = new int[size];
		
		  }
		  
		  void number() {
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number :");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();

		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}

	void min() {
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			min = a[i] < min ? a[i] : min;
		}
		System.out.println("\n \n minium number is " + min);
	}

	void max() {
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			max = Math.max(a[i], max);
		}
		System.out.println("\n maximum number is " + max);

	}

}
