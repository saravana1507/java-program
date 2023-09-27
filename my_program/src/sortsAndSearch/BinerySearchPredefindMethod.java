package sortsAndSearch;

import java.util.Arrays;

public class BinerySearchPredefindMethod {

	public static void main(String[] args) {

		int a[]= new int[]{3,6,4,7,8,5,9};
		
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println("found the index is = "+Arrays.binarySearch(a,3));
	}

}
