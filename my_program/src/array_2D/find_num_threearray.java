package array_2D;
//three array same number find to output
public class find_num_threearray {
	public static void main(String[] args) {
		find_num_threearray ob = new find_num_threearray();
		ob.thirdarray();

	}

	public void thirdarray() {
		int a[] = { 1, 2, 3, 4, 5 };
		int b[] = { 7, 9, 3, 1, 8 };
		int c[] = { 0, 1, -3, 5, 8 };
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					count++;
				}
			}
		}
		int temp[] = new int[count];
		int num = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					temp[num] = a[i];
					num++;
				}
			}
		}

		for (int i = 0; i < temp.length; i++) {
			for (int j = 0; j < c.length; j++) {
				if (temp[i] == c[j]) {
					System.out.println(" the number is :" + c[j]);
				}
			}
		}

	}

}
