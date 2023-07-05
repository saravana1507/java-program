package map.program;

import java.util.*;

public class Create_map {

	public static void main(String[] args) {
     
		Map<Integer,String> s= new HashMap<>();
		s.put(1, "samsung");
		s.put(2, "nokia");
		s.put(3, "apple");
		s.put(4, "vivo");
		s.put(6, "nokia");
		s.put(6, "mi");
		System.out.println(s);
		// map convert to  set 
	System.out.println(s.entrySet());
	// map get only convert key in set
	System.out.println(s.keySet());
	// map get only values convert to collections
		System.out.println(s.values());
		// present the value true or false
		// if true present the value .false return null value
		System.out.println(s.putIfAbsent(6,"mi"));
		System.out.println(s.putIfAbsent(7,"nokia"));
		// get using for input key number to get the key value in output
		System.out.println(s.get(3));
		// if any element change using this method
		s.replace(3, "oneplus");
		System.out.println(s);
		Map nw = new TreeMap(s);
		System.out.println(s);
		Map nw1 = new LinkedHashMap(s);
		System.out.println(s);
	}

}
