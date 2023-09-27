package practise_program;

public class practive1 {

	public static void main(String[] args) {
      int a[]= {1,2,1,3,1,2,4,3,5};
      int n=0;
      for(int i=0;i<a.length;i++)
      {  
    	  if(n==i)
    	  {
    		  System.out.println(a[i]);
    		  n=2*i+2;
    	  }
      }
	}

}
