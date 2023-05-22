package forloop;
//perfect number in program 
// perfect number is input number and divide number count are same
// 6= 1+2+3 is a perfect number

public class Perfect_number {

	public static void main(String[] args) {
		Perfect_number obj= new Perfect_number();
		obj.number(6);

	}
void  number(int num)
{
	int a=num;
	int total=0;
	for(int i=1;i<num;i++)
	{
		if(num%i==0)
	{
		total=total+i;
	}
	}
if(a==total) {
	System.out.println(a+" is a perfect number");
}
else
{
	System.out.println(a+" is a not perfect number");
}
}
}
