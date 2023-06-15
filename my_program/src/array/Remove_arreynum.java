package array;
import java.util.Scanner;
public class Remove_arreynum extends Input {

	public static void main(String[] args) {
	number();
	Remove_arreynum ob=new Remove_arreynum();
	Scanner s=new Scanner(System.in);
	ob.remove(s);

	}
	void remove(Scanner s) {
		
		System.out.println("\nremove the number");
		int n=s.nextInt();
		int temp=0;
		int b[]=new int[a.length-1];
		for(int i=0;i<a.length;i++)
		{
			if(n!=a[i])
			{
				b[temp]=a[i];
			temp++;
			}
		}
		System.out.println("remove the array :\n");
	for(int i=0;i<b.length;i++) {
		System.out.print(b[i]+" ");
	}
	}

}
