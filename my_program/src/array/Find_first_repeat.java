package array;
//user input elements to find the repeat first repeat element

public class Find_first_repeat {

	public static void main(String[] args) {
		Find_first_repeat obj = new Find_first_repeat();
		Input.number();
		obj.find_number();

	}

	void find_number() {
		boolean flag = false;
		for (int i = 0; i < Input.a.length; i++) {
			for (int j = i + 1; j < Input.a.length; j++) {
				if (Input.a[i] == Input.a[j]) {
					System.out.println("\nfirst repeat number =" + Input.a[i]);
					flag = true;
					break;
				}
				if (flag == true) {
					break;
				}
			}
			if (flag == false && i == Input.a.length - 1) {
				System.out.println("\nno repeated elements");
			}
		}

	}
}
