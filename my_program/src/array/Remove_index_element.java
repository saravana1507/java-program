package array;

import java.util.Scanner;

public class Remove_index_element extends Input {

	public static void main(String[] args) {
		number();
		Remove_index_element ob=new Remove_index_element();
		Scanner s=new Scanner(System.in);
		ob.remove(s);
	}
	void remove(Scanner s) {
    	System.out.println("\nremove the index number");
		int n=s.nextInt();
		int temp=0;
		int b[]=new int[a.length-1];
		if(n<a.length && n>=0)
		{
		for(int i=0;i<a.length;i++)
		{
			if(a[n]!=a[i])
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
		else {
			System.out.println("this index number not in ths array");
		}
	}
}
