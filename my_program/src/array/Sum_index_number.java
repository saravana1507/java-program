package array;
import java.util.Scanner;; 
public class Sum_index_number extends Input{
	
	public static void main(String[] args) {
		Sum_index_number ob=new Sum_index_number();
		number();
		ob.check();
	}
	void check() {
	
		Scanner s= new Scanner(System.in);
		System.out.println("\nenter the sum number =");
		int check=s.nextInt();
		int total=0;
		boolean flag=false;
		System.out.println("found the number");
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
			   total=a[i]+a[j];
				if(check==total)
				{ flag=true;
					System.out.println(i+" index element "+a[i]+" + "+j+" index element "+a[j]+" = "+check);
				}
			}
		}		
		if(flag==false)
		{
			System.out.println(" not founded the element");
		}
	}
}
