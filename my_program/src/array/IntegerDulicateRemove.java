package array;

import java.util.Scanner;

//  runtime input the value to remove duplicate in stored array
public class IntegerDulicateRemove {

	public static void main(String[] args) {
		IntegerDulicateRemove obj = new IntegerDulicateRemove();
		obj.number();
	}

	public void number() {
		Scanner scan = new Scanner(System.in);
		System.out.println(" enter the size : ");
		int size = scan.nextInt();
		System.out.println(" enter the number : ");
		int number[] = new int[size];

		for (int i = 0; i < size; i++) {
			boolean flag = false;
			int s = scan.nextInt();
			for (int j = 0; j <= i; j++) {
				if (number[j] == s) {
					flag = true;
					break;
				}
			}
			if (flag == false) {
				number[i] = s;
			}

		}
		System.out.println("\nnon Duplicate elements");
		for (int i = 0; i < size; i++) {
			System.out.print(number[i] + " ");
		}
		scan.close();
	}

}
