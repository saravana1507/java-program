package whileloop;

public class Fibonacci
  {
 public static void main(String arg[])
     {
		Fibonacci obj=new Fibonacci();
		 obj.number(5);
     }
 public void number(int n)
    {
	int first=-1;
	int second=1;
	int count=1;
	while(count<=n)
	{
	int a=first+second;
	System.out.println(a);
	first=second;
	second=a;
	count++;
	}

  }

}
