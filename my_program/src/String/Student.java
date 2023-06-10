package String;

public class Student {
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student mycode=new Student();
		Student code=new Student();
		System.out.println("first object hashcode:"+mycode.hashCode());
		System.out.println("second object hashcode:"+code.hashCode());
	   String ob=new String("apple");
	   String obj=new String("apple");
	   System.out.println("first string hashcode:"+ob.hashCode());
		System.out.println("second string hashcode:"+obj.hashCode());
	   System.out.println( mycode==code);
		System.out.println(mycode.equals(code));
		//	c.equals(c);
	//	c.hashCode();
		
		//System.out.println(c.toString());
      mycode.name();
		
	}

	
	public String studentname ()
	{
		String name="sara";
		return name;
	}

	/*
	 * public String toString() { return studentname(); }
	 */
  public void name() {
	  String s="welcome";
	  String s1="WELCOME";
	  String s2="welcome";
	  System.out.println(s.hashCode());
	  System.out.println(s1.hashCode());
	  System.out.println(s2.hashCode());
	  System.out.println();
	  System.out.println(s==s2);
	  System.out.println(s==s1);
	  System.out.println(s1==s2);
	  System.out.println();
	  System.out.println("s equals ="+s.equals(s2));
	  System.out.println("s1 equals ="+s.equals(s1));
	  System.out.println("s2 equals ="+s1.equals(s2));
  }
	
  


}
