package array;

import java.util.Scanner;
// runtime input value to duplicate cannot assign in array 

public class StringDuplicateRemove {

	public static void main(String[] args) {
		StringDuplicateRemove ob = new StringDuplicateRemove();
		ob.word();
	}

	public void word() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size :");
		int size = scan.nextInt();
		String a[] = new String[size];
		System.out.println("enter the word :");
		for (int i = 0; i < size; i++) {
			boolean flag = false;
			String word = scan.next();
			for (int j = 0; j <= i; j++) {
				if (word.equals(a[j])) {
					flag = true;
					a[i] = " ";
					break;
				}
			}
			if (flag == false) {
				a[i] = word;
			}

		}
		System.out.println("\n");
		for (String i : a) {
			System.out.print(i + " ");
		}
	}

}
