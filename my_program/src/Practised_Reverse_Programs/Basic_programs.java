package Practised_Reverse_Programs;
// practise the programs
public class Basic_programs {

	public static void main(String[] args) {
		Basic_programs ob = new Basic_programs();
		ob.num();
		ob.num1();
		ob.num2();
		ob.num3();
		ob.num4();
		ob.num5();
		ob.num6();
		ob.num7();
		ob.num8();
		ob.num9();
		ob.num10();
		ob.num11();
		ob.num12();
	}
	// natural number print

	public void num() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}

	// odd number print
	public void num1() {
		System.out.println();
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1)
				System.out.println("odd number:" + i);
		}
	}

	// even number print
	public void num2() {
		System.out.println();
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0)
				System.out.println("even number:" + i);
		}
	}

	// number divide 6
	public void num3() {
		System.out.println();
		for (int i = 1; i <= 50; i++) {
			if (i % 9 == 0)
				System.out.println(" 9 devide number:" + i);
		}
	}

	// Prime number
	public void num4() {
		System.out.println();
		int num = 17;
		boolean flag = false;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				flag = true;
				break;
			}
		}
		if (flag == false) {
			System.out.println(num + " is prime number");
		} else {
			System.out.println(num + " is not prime number");
		}
	}

	// reverse number

	public void num5() {
		int a = 123;
		int reverse = 0;
		System.out.println();
		for (int i = a; i > 0; i /= 10) {
			int digit = i % 10;
			reverse = reverse * 10 + digit;
		}
		System.out.println("Reverse number:" + reverse);
	}

	// digit number

	public void num6() {
		int a = 123;
		int count = 0;
		System.out.println();
		for (int i = a; i > 0; i /= 10) {
			count++;
		}
		System.out.println("Digit number:" + count);
	}

	// neon number

	public void num7() {
		int a = 12;
		int count = 0;
		int square = a * a;
		System.out.println();
		for (int i = square; i > 0; i /= 10) {
			int digit = i % 10;
			count = count + digit;
		}
		if (a == count) {
			System.out.println(a + " is a neon number");
		} else {
			System.out.println(a + " is a not neon number");
		}
	}

	// armstrong number

	public void num8() {
		int a = 153;
		int count = 0;
		System.out.println();
		for (int i = a; i > 0; i /= 10) {
			int digit = i % 10;
			int square = digit * digit * digit;
			count = count + square;
		}
		if (a == count) {
			System.out.println(a + " is a armstrong number");
		} else {
			System.out.println(a + " is a not armstrong number");
		}
	}

	// fibonacci number
	public void num9() {
		int first = 0;
		int second = 1;

		int sum = 0;
		System.out.println();
		for (int i = 5; i > 0; i--) {
			sum = first + second;
			first = second;
			second = sum;
		}
		System.out.println("fibonacci number : " + sum);

	}

	// factorial number
	public void num10() {
		int a = 5;
		int sum = 1;
		System.out.println();
		for (int i = a; i > 0; i--) {
			sum = sum * i;
		}
		System.out.println("factorial number :" + sum);

	}
	// magic number

	public void num11() {
		int a = 1358;
		int count = 0;
		System.out.println();
		for (int i = a; i > 0; i /= 10) {
			int digit = i % 10;
			count = count + digit;
		}
		int reverse = 0;
		for (int i = count; i > 0; i /= 10) {
			int digit = i % 10;
			reverse = reverse * 10 + digit;
		}
		int total = count * reverse;
		if (a == total) {
			System.out.println(a + " is a magic number");
		} else {
			System.out.println(a + " is a not magic number");
		}
	}

	// polindrome number
	public void num12() {
		int a = 121;
		int reverse = 0;
		System.out.println();
		for (int i = a; i > 0; i /= 10) {
			int digit = i % 10;
			reverse = reverse * 10 + digit;
		}
		if (a == reverse) {
			System.out.println(a + " is a polindrome number");
		} else {
			System.out.println(a + " is a not polindrome number");
		}
	}
}
