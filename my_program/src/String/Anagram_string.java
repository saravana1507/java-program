package String;

import java.util.Arrays;
import java.util.Scanner;
// this is anagram method
// first letter and second letter are same character is anagram

public class Anagram_string {

	public static void main(String[] args) {
		Anagram_string ob=new Anagram_string();
		ob.anagram();

	}

	public void anagram(){
       Scanner scan= new Scanner(System.in);
       System.out.print(" enter the first word :");
       String a=scan.next();
       System.out.print(" enter the second word :");
       String b=scan.next();
       if(a.length()!=b.length())
		{
			System.out.println("\nthis is not anagram");
		}
		char first[]=a.toCharArray();
		Arrays.sort(first);
		char second[]=b.toCharArray();
		Arrays.sort(second);
		for(int i=0;i<first.length;i++)
		{
			if(first[i]!=second[i])
			{
				System.out.println("\nthis is not a anagram");
				break;
			}
			if(i==first.length-1)
			{
				System.out.println("\nthis is a anagram");
			}
		}
	scan.close();	
	}
}
