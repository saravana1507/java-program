package String;

import java.util.Scanner;

// every word second letter to change in capital letter

//  string sentence to split() used to split the sentence then assign string []

//  string [] 1 index small letter then change to capital letter 
// if second letter capital not change to assigned


public class Second_lettercaps_string {

	public static void main(String[] args) {
		Second_lettercaps_string ob=new Second_lettercaps_string();
		ob.word();

	}

	public void word()
	{   Scanner scan=new Scanner(System.in);
	System.out.println("input the sentence :" );	
	String s=scan.nextLine();
		String a[]=s.split(" ");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length();j++)
			{
			
				 if( j==1  && (int)a[i].charAt(j)>=97 && (int)a[i].charAt(j)<=122)
				     {
					 char first=a[i].charAt(j);
					char second= (char)(first-32);
					a[i]=a[i].replace(first, second);
				  }
			}
		}
		System.out.print("change second letter caps in this sentence :\n");
		for(String i:a)
		{
		   System.out.print(i+" ");
		}
		scan.close();
	}
}
