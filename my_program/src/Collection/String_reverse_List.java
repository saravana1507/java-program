package Collection;
// reverse the element in the list

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class String_reverse_List {

	public static void main(String[] a) {
		String_reverse_List ob =new String_reverse_List();
		ob.name();

	}
	
	public void name()
	{
		List<String> name= Arrays.asList("chicken","mutton","fish","beef");
		System.out.println(name);
		List<StringBuffer> name1=new ArrayList();
		for(String i: name)
		{  
		StringBuffer n=new StringBuffer(i);
		 name1.add(	n.reverse());
			
		}
		System.out.println("Reverse the list:\n"+name1);
	}

}
