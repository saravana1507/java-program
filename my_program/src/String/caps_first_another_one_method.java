package String;

public class caps_first_another_one_method {

	public static void main(String[] args) {
		caps_first_another_one_method ob=new caps_first_another_one_method();
		ob.word();

	}

	public void word()
	{
		String s="i love myself";
		System.out.println(s+"\n");
		String a[]=s.split(" ");
		String change="";
		for(String i:a)
		{
			String first=i.substring(0,1);
			String add= i.substring(1);
			change=change+first.toUpperCase()+add+" ";
		}
		System.out.println(change);
	}
}
