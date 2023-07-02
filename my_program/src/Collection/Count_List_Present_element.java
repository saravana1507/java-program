package Collection;
// count the elements in the arraylist

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Count_List_Present_element {

	public static void main(String[] args) {
		Count_List_Present_element ob = new Count_List_Present_element();
		ob.number(ob.num());
	}

	public List<Integer> num() {
		List<Integer> num = new ArrayList<Integer>();
		num.add(5);
		num.add(4);
		num.add(6);
		num.add(5);
		num.add(7);
		num.add(3);
		num.add(4);
		num.add(7);
		num.add(2);
		System.out.println(num + "\n");
		return num;
	}

	public void number(List<Integer> num) {
		Set<Integer> number = new HashSet<>(num);

		for (Integer i : number) {
			System.out.println(i + "  elements count = " + Collections.frequency(num, i));
		}

	}

}
