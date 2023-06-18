package String;

import java.util.Scanner;

// input the sentence to count the each character

public class Count_each_letter {

	public static void main(String[] args) {
		Count_each_letter ob = new Count_each_letter();
		ob.word();
	}

	public void word() {
           Scanner scan= new Scanner(System.in);
           System.out.println("enter the sentence: ");
           String s=scan.nextLine();
		char a[] = s.toCharArray();
		char temp[] = new char[a.length];
		int plus = 0;
		for (int i = 0; i < a.length; i++) {
			boolean flag = false;
			for (int j = 0; j < a.length; j++) {
				if (a[i] == temp[j] || a[i] == ' ') {
					flag = true;
				}
			}
			if (flag == false) {
				temp[plus] = a[i];
				plus++;
			}
		}
		int num = 0;
		int[] count = new int[a.length];

		for (int i = 0; i < a.length; i++) {
			int total = 1;
			for (int j = i + 1; j < a.length; j++) {
				if ((a[i] == a[j]) && (a[i] != ' ')) {
					total++;
					a[j] = ' ';
				}
			}
			if (total >= 1 && a[i] != ' ') {
				count[num] = total;
				num++;
			}
		}

		for (int i = 0; i < a.length; i++) {
			System.out.println(temp[i] + "  present " + count[i] + " times");
		}
	scan.close();
	}
}
