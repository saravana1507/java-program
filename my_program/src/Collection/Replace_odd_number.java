package Collection;

// replace the element in choosing yours
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Replace_odd_number {

	public static void main(String[] args) {
		List<Integer> num = new ArrayList();
		num.add(6);
		num.add(5);
		num.add(7);
		num.add(4);
		num.add(5);
		num.add(8);
		num.add(5);
		System.out.println(num);
		ListIterator<Integer> n = num.listIterator();
		while (n.hasNext()) {
			if ((int) n.next() % 2 == 1) {
				n.set(99);
			}
		}
		System.out.println("REPLACE ODD NUMBER:");
		System.out.println(num);
	}

}
