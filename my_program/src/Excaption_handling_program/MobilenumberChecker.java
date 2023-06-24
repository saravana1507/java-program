package Excaption_handling_program;
// correct mobile number checked in exception handling 

import java.util.Scanner;

public class MobilenumberChecker {

	public String input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the mobile number");
		String number = scan.next();
		return number;

	}

	public void number(String number) {
		try {
			if (number.length() != 10) {
				throw new lengthException("this is not a mobile number");
			}
			if (number.length() == 10) {
				for (int i = 0; i < number.length(); i++) {
					if (number.codePointAt(i) < 47 || number.codePointAt(i) > 57) {
						throw new NumberMismatchException("only input number");
					}
				}
			}
			if (number.codePointAt(0) < 54) {
				throw new WrongnumberException(" wrong mobile number");
			} else {
				System.out.println(" mobile number is correct");
			}

		} catch (lengthException a) {
			System.out.println(a.getMessage());
		} catch (NumberMismatchException b) {
			System.out.println(b.getMessage());
		} catch (WrongnumberException c) {
			System.out.println(c.getMessage());
		} finally {
			display();
		}
	}

	public void display() {
		System.out.println("thank you");
	}

}
