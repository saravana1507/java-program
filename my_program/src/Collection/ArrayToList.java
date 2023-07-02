package Collection;

// array to convert arraylist
import java.util.*;

public class ArrayToList {

	public static void main(String[] args) {
		ArrayToList ob = new ArrayToList();
		ob.name();
		ob.number();
		ob.num();
	}
	// String array convert to arraylist

	public void name() {
		String a[] = { "saravana", "bala", "stephen", "rahman", "saravana", "stephen" };
		List<String> name = new ArrayList(Arrays.asList(a));
		System.out.println("Array to list:");
		System.out.println(name);
		name.add("lajeem");
		name.add("harish");
		System.out.println("Adding the name in list");
		System.out.println(name);
		Set name1 = new LinkedHashSet(name);
		System.out.println("Remove duplicate element");
		System.out.println(name1 + "\n");
	}

	// integer array convert to list
	public void number() {
		Integer num[] = { 5, 6, 7, 3, 4, 5, 3, 8, 9 };
		List<Integer> number = new ArrayList(Arrays.asList(num));
		System.out.println("Array to list:");
		System.out.println(number);
		number.add(2);
		number.add(1);
		System.out.println("Adding the number in list");
		System.out.println(number);
		Set number1 = new TreeSet(number);
		System.out.println("Remove duplicate element and ascending order");
		System.out.println(number1+"\n");
	}
	
	// int array convert to list
	public void num() {
		int a[]= {1,3,5,6,8,5};
		List<Integer> number = new ArrayList();
		for(int i:a)
		{
			number.add(i);
		}
		System.out.println("Array to list:");
		System.out.println(number);
	}
}
