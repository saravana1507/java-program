package withoutloop;

public class Palindrome_recursion {
public static void main(String arg[])
{
	Palindrome_recursion obj=new Palindrome_recursion();
	System.out.println("----- palindrome number-------");
	int a=121;
	int rev=0;
	int reverse=obj.palindrome(a,rev);
	if(a==reverse)
	{
		System.out.println(a+" = is a polindrome number");	
	}
	else
	{
		System.out.println(a+" = is a not palindrome number");
	}
	
}



public int palindrome (int n,int revrse)
{ 
	if (n==0) {
		
		return revrse;
	}
		int num=n%10;	
	return palindrome (n/10,revrse*10+num);   
}

}
