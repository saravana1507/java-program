package do_whileloop;

public class Armstrong_dowhile {

	public static void main(String arg[])

	{
	Armstrong_dowhile ob=new Armstrong_dowhile();
	ob.armstrong(153);
	ob.armstrong(154);
}
public void armstrong(int a)
{   int i=a;
  int total=0;
  do {
	  int digit=i%10;
	  int count=digit*digit*digit;
	  total=count+total;
	  i/=10;
  }while(i>0);
  
  if(a==total)
  {
	  System.out.println(a+" is a armstrong number");
  }
  else
  {
	  System.out.println(a+" is a not armstrong number");
  }
}
}
