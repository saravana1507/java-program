package forloop;

public class Magicnumber_forloop {

	public static void main(String[] args) {
		Magicnumber_forloop obj=new Magicnumber_forloop();
          obj.number(1342);
          obj.number(1458);
	}
	public void number(int num)
	{   int count=0;
		for(int i=num;i>0;i/=10)
		{
			int split=i%10;
			count=count+split;
		}
		int swap=0;
		for(int j=count;j>0;j/=10)
		{
			int digit=j%10;
			swap=swap*10+digit;
		}
		int magic=count*swap;
		if(magic==num)
		{
			System.out.println(num+" = is a magic number");
		}
		else
		{
			System.out.println(num+" = is a not magic number");
		}
	}

}
