package array;
import java.util.Scanner;
public class remove_arrey_element extends Input {
int b[];
	public static void main(String[] args) {
		number();
		remove_arrey_element ob=new remove_arrey_element();
		ob.remove();

	}
	void remove() {
	Scanner s= new Scanner(System.in);	
	System.out.println("\nhow many size remove:"); 
	int n=s.nextInt();
	System.out.println("choose the number : ");
   int[] chs=new int[n];
	for(int i=0;i<chs.length;i++)
	{
		chs[i]=s.nextInt();
	}
	   int des=0;
	   boolean flag=false;
    
	for(int i=0;i<chs.length;i++)
	{ 	
		for(int j=0;j<a.length;j++) {
			  b= new int[a.length-des];
			if(chs[i]==a[j])
			{  flag=true;
			     des++;
				for(int k=j;k<b.length;k++)
				{
					b[k]=a[k+1];	
				
				}
					
             }
			if(flag==false)
			{
	 b[j]=a[j];}
		}
		}
		
	for(int i=0;i<b.length;i++)
	{
		System.out.println(b[i]+" ");
	}
	}
}
