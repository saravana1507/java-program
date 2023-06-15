package String;

public class Count_vowel_letter {

	public static void main(String[] args) {
		Count_vowel_letter ob= new Count_vowel_letter();
		String s=ob.total();
		ob.each(s);
		
		
	}
	
	//  find the all vowels count 
    public String total()
    {
    	String s="india is my country all indian is my sister and brother";
    	int count=0;
    	for(int i=0;i<s.length();i++)
    	{
    		if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
    		{
    			count++;
    		}
    	}
    	System.out.println("vowels count : "+count);
    	return s;
    }
    
    // each vowels count
    public void  each(String s)
    {
    	int count=0;
    	int count1=0;
    	int count2=0;
    	int count3=0;
    	int count4=0;
    	for(int i=0;i<s.length();i++)
    	{
    		if(s.charAt(i)=='a')
    		{
    			count++;
    		}
    		if(s.charAt(i)=='e')
    		{
    			count1++;
    		}
    		if(s.charAt(i)=='i')
    		{
    			count2++;
    		}
    		if(s.charAt(i)=='o')
    		{
    			count3++;
    		}
    		if(s.charAt(i)=='u')
    		{
    			count4++;
    		}
    	}
    	System.out.println("\na vowels count : "+count);
    	System.out.println("e vowels count : "+count1);
    	System.out.println("i vowels count : "+count2);
    	System.out.println("o vowels count : "+count3);
    	System.out.println("u vowels count : "+count4);
   
    }
}
