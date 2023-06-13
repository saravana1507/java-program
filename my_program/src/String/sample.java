package String;

public class sample {
    
	public static void main(String[] args) {
	byte num[]= {43,59,35,42,55};
	char name[]= {'a','b','c'};
 String b= new String(num);
 String d= new String(name);
 System.out.println(b);
 System.out.println(d);
 sample ob=new sample();
 ob.toString();
 ob.number();
	}
public String toString() {
	return"saravana";
}

public void number() {
	String s="  app le  ";
String s1=s.strip();
String s2=s.stripLeading();
String s3=s.stripTrailing();
System.out.println(s1);
System.out.println(s2);
System.out.println(s3);
s.contains(s3);
s.contentEquals(s);
}
}
