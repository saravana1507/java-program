package NewLogicProgram;

public class NewPractise {

	public static void main(String[] args) {
      NewPractise ob= new NewPractise();
     // ob.pattern();
      //ob.String();
      //ob.String1();
      ob.Array();
      
		}
		
		public void pattern()
		{

			for(int i=1;i<=5;i++) {
				for(int k=5;k>i;k--)
				{
					System.out.print(" ");
				}
				for(int j=0;j<i;j++)
				{
				System.out.print(i+" ");
					
				}
				System.out.println();			
		}
	}
     
		public void String()
		{
			String name="Payilagam        is      bad";	
		    System.out.println(name.replaceAll("\\s+"," "));
		}
	
		public void String1()
		{
			String name="________Payilagam_________is____bad____";	
            System.out.println(name.replaceAll("_"," ").trim());
		}
		
		public void Array()
		{
			String a=" i am a super star";
			for(String i:a.split(" "))
			{
				if(i.length()%2==0)
				{
					System.out.println(i);
				}
			}
		}
}
