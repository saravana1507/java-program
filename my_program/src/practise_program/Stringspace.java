package practise_program;

public class Stringspace {

	public static void main(String[] args) {
       
		String s="new";
		int k=18;
		int n=2;
		   int count=0;
           int y=n;
       for(int j=0;j<y;y/=10)
        {
           count++;
        }
		for(int i=s.length();i<k;i++)
		{
			if(i<15) {
		  	s+=" ";}
			if(i==15&&count==3)
			{
				s+="00"+n;
			}
			if(i==15&&count==2)
			{
				s+="0"+n;
			}
			if(i==15&&count==1||count==0)
			{
				s+="00"+n;
			}
		}
		
		System.out.println(s);
	}

}
