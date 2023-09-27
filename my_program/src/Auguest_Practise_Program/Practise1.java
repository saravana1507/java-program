package Auguest_Practise_Program;

public class Practise1 {
	static {
		System.out.println("hai");
		System.exit(0);
	}
	/*
	 * public static void main(String[] args) {
	 * 
	 * Practise1 ob= new Practise1(); //ob.num(); ob.number1(); }
	 */

	// 1 to 100 number divided by 5 and 100 to 300 number divided by 7 and 300 to 500 divided by 9
	/*
	 * public int num() { int num=500; for(int i=0; i<=500;i++) { if(((i>0&&i<=100)
	 * && (i%7==0 && i%6==0))||((i>100&&i<=300)&&(i%7==0 &&
	 * i%6==0))||((i>300&&i<=500)&&(i%9==0 && i%8==0))) {
	 * 
	 * System.out.println((i/2)+" divided number: "+i); } }
	 * 
	 * return num; }
	 */
	
	// count the number
	
	public int number()
	{
		int a=4; 
		double b=5.5;
		char c='a';
		System.out.println(a+b+c);
		return a;
	}

	
	// count the total
	public int number1()
	{
		int a=4; 
		double b=2.0;
		byte i=6;
		int c=i;
		System.out.println(a/b-c*a+c);  // 4/2.0-6+4*6
		return a;
	}
}
