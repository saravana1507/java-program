package array;
// input the number in array find the maximum number and minimum number
import java.util.Scanner;

public class Min_max_number {

	public static void main(String[] args) {
		Min_max_number ob = new Min_max_number();
		
		Input.size();
		Input.number();
		ob.min();
		ob.max();

	}
	void min() {
		int min = Input.a[0];
		for (int i = 0; i < Input.a.length; i++) {
			min = Input.a[i] < min ? Input.a[i] : min;
		}
		System.out.println("\n \n minium number is " + min);
	}

	void max() {
		int max = Input.a[0];
		for (int i = 0; i < Input.a.length; i++) {
			max = Math.max(Input.a[i], max);
		}
		System.out.println("\n maximum number is " + max);

	}

}
