package Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Remove_All_dublicate_list {

	public static void main(String arg[]) {
		Remove_All_dublicate_list ob = new Remove_All_dublicate_list();
		ob.letter();
	}

	public void letter() {
		List<Character> letter = new ArrayList();
		letter.add('h');
		letter.add('e');
		letter.add('l');
		letter.add('l');
		letter.add('o');
		letter.add('h');
		letter.add('i');
		System.out.println(letter);

		for (int i = 0; i < letter.size(); i++) {
			{
				for (int j = i + 1; j < letter.size(); j++) {
					if ((char) letter.get(j) == (char) letter.get(i)) {
						letter.set(j, null);
					}

				}
				ListIterator<Character> n = letter.listIterator();
				while (n.hasNext()) {
					if (n.next() == null) {
						n.remove();
					}
				}
			}
		}
		System.out.println("Remove duplicate elements:");
		System.out.println(letter);
	}
}
