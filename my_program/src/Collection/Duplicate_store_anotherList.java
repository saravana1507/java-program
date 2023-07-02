package Collection;

// find duplicate element in the list
import java.util.*;

public class Duplicate_store_anotherList {

	public static void main(String[] args) {

		List<Character> letter = Arrays.asList('a', 'b', 'c', 'd', 'a', 'c', 's', 'a');
		Set<Character> duplicate = new HashSet<>();
		Set<Character> n = new HashSet<>();
		for (Character i : letter) {
			if (n.contains(i)) {
				duplicate.add(i);
			} else {
				n.add(i);
			}
		}
		System.out.println("first element :\n" + letter);
		System.out.println("non duplicate element:\n" + n);
		System.out.println("duplicate element:\n" + duplicate);
	}

}
