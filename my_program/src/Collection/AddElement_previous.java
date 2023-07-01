package Collection;

// input the number to assign privous adding the value
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class AddElement_previous {

	public static void main(String[] args) {
		List<Integer> num = new ArrayList();
		num.add(6);
		num.add(5);
		num.add(8);
		num.add(4);
		num.add(5);
		num.add(8);
		num.add(5);
		System.out.println(num);
		ListIterator<Integer> n = num.listIterator();
		while (n.hasNext()) {
			n.next();
		}
		while (n.hasPrevious()) {
			if ((int) n.previous() == 8) {
				n.add(888);
			}
		}
		System.out.println(num);
	}
}
