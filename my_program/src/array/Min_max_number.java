package array;
// input the number in array find the maximum number and minimum number

// and second maxmium number and second minimum number

public class Min_max_number {

	public static void main(String[] args) {
		Min_max_number ob = new Min_max_number();
		Input.size();
		Input.number();
		ob.min();
		ob.max();
		ob.maximum();
		ob.sec_maximum();
		ob.sec_minimum();
	}

	void min() {
		int min = Input.a[0];
		for (int i = 0; i < Input.a.length; i++) {
			min = Input.a[i] < min ? Input.a[i] : min;
		}
		System.out.println("\n \nminium number is " + min);
	}

	void max() {
		int max = Input.a[0];
		for (int i = 0; i < Input.a.length; i++) {
			max = Math.max(Input.a[i], max);
		}
		System.out.println("\nmaximum number is " + max);

	}

	void maximum() {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < Input.a.length; i++) {
			if (max < Input.a[i])
				max = Input.a[i];
		}
		System.out.println("max num =" + max);
	}

	void sec_maximum() {
		int max = Integer.MIN_VALUE;
		int sec_max = max;
		for (int i = 0; i < Input.a.length; i++) {
			if (max < Input.a[i]) {
				sec_max = max;
				max = Input.a[i];

			}
			if (sec_max < Input.a[i] &&  max != Input.a[i]) {
				sec_max = Input.a[i];
			}

		}
		System.out.println("second max num =" + sec_max);
	}

	void sec_minimum() {
		int min = Integer.MAX_VALUE;
		int sec_min = min;
		for (int i = 0; i < Input.a.length; i++) {
			if (min > Input.a[i]) {
				sec_min = min;
				min = Input.a[i];
			}
			if (sec_min < Input.a[i] && min !=Input.a[i] ) {
				sec_min = Input.a[i];
			}
		}
		System.out.println("second min num =" + sec_min);
	}

}
